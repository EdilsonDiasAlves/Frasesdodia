package com.mz.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var phrase:TextView
    var randomIndex:Int = 0

    val phraseList = arrayOf(
        "Faça sempre o seu melhor!",
        "E acredite que o melhor possa ser feito!",
        "Não espere, ponha em prática!",
        "Mesmo que pareça difícil, não pare!",
        "Só trabalhando é possível trilhar o caminho!",
        "Tenha coragem!",
        "Descubra quem você realmente é…",
        "Não espere que as respostas caiam do céu!",
        "Aprenda a lidar com as situações do melhor jeito!",
        "Veja sempre o que há de positivo nas coisas!",
        "Não seja vítima das dificuldades, tente ultrapassá-las!",
        "Nunca perca a esperança!",
        "Desistir à primeira é para os fracos, tente sempre mais uma vez!"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phrase = findViewById<TextView>(R.id.text_mensagem)
    }

    fun createPhrase(view:View){
        Log.d("INDEX", "O Index é $randomIndex")
        randomIndex = Random.nextInt(phraseList.size)

        val phraseSelected = phraseList.get(randomIndex)
        phrase.setText(phraseSelected)
    }
}