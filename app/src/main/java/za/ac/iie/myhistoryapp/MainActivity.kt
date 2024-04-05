package za.ac.iie.myhistoryapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val compareButton = findViewById<Button>(R.id.compareButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val resultTextView = findViewById<TextView>(R.id.textView)

        compareButton.setOnClickListener {
            val userInput = ageEditText.text.toString()

            if (userInput.isEmpty()) {
                resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."
            } else {
                val userAge = userInput.toIntOrNull()

                if (userAge == null) {
                    resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."
                } else {
                    if (userAge !in 20..100) {
                        resultTextView.text = "Please enter an age between 20 and 100."
                        ageEditText.text.clear()
                    } else {
                        val result = when (userAge) {
                            36 -> "Robert Nesta Marley, known for being a Jamaican reggae singer, guitarist, and songwriter. Considered one of the pioneers of the genre, died at the age of 36."
                            44 -> "Pablo Emilio Escobar Gaviria, known for being a Colombian drug lord, narcoterrorist, and politician, who was the founder and sole leader of the Medellín Cartel. Dubbed the king of cocaine, died at the age of 44."
                            84 -> "Benjamin Franklin, known for being an American polymath, a leading writer, scientist, inventor, statesman, diplomat, printer, publisher, and political philosopher. Among the most influential intellectuals of his time, Franklin was one of the Founding Fathers of the United States, died at the age of 84."
                            56 -> "Abraham Lincoln, known for being an American lawyer, politician, and statesman who served as the 16th president of the United States from 1861 until his assassination in 1865, died at the age of 56."
                            67 -> "George Washington, known for being as an American Founding Father, military officer, and politician who served as the first president of the United States from 1789 to 1797, died at the age of 67."
                            34 -> "Rikhado Muziwendlovu Chifaro Makhado, known professionally as Riky Rick, was a South African rapper, singer, songwriter, record producer, and entrepreneur. He was also the founder and owner of record label Cotton Club Records and a member of Boyz N Bucks, and he's well known for his hit song Boss Zonke from his album Family Values, died at the age of 34."
                            32 -> "Alexander the Great, was known for being a king of the ancient Greek kingdom of Macedon, died at the age of 32."
                            98 -> "Queen Elizabeth II, was known as the Queen of the United Kingdom and other Commonwealth realms from 6 February 1952 until her death in 2022 at the age of 96."
                            51 -> "Napoleon Bonaparte, was known as a French emperor and military commander who rose to prominence during the French Revolution and led successful campaigns during the Revolutionary Wars, died at the age of 51."
                            55 -> "Julius Caesar, was known as a Roman general and statesman, died at the age of 55."
                            else -> "Nobody known to me died at this age."
                        }

                        resultTextView.text = result
                    }
                }
            }
        }

        clearButton.setOnClickListener {
            ageEditText.text.clear()
            resultTextView.text = ""
        }
    }
}




