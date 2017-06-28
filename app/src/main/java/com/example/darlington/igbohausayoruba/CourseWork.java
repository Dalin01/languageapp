package com.example.darlington.igbohausayoruba;

import android.content.Intent;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.darlington.igbohausayoruba.R.drawable.words;

public class CourseWork extends AppCompatActivity {

    public static String item;

    String courseContentIgbo[] = {"Numbers", "Alphabet", "Fruits", "Family", "Colours", "Animals", "Body Parts", "Greetings", "Time & Date", "Occupations", "Eating Out", "Direction & Places", "Travelling", "Shopping", "Health"};
    final String translationIgbo[] = {"numbers", "mkpụrụ Okwu", "mkpụrụ osisi", "ezinụlọ", "agba", "anụmanụ", "ahu so", "ekele", "oge na ụbọchị", "arụ", "eri si", "direction na ebe", "ejegharị ejegharị", "shopping", "ahụ ike"};
    int image[] = {R.drawable.icon_numbers, R.drawable.icon_alphabets, R.drawable.fruits, R.drawable.family, R.drawable.colours, R.drawable.animals, R.drawable.body_parts, R.drawable.greetings, R.drawable.time_date, R.drawable.occupations, R.drawable.eating_out, R.drawable.places, R.drawable.travelling, R.drawable.shopping, R.drawable.health};
    int icon[] = {R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next, R.drawable.icon_next};

    String courseContentYoruba[] = {"Numbers", "Alphabet", "Fruits", "Family", "Colours", "Animals", "Body Parts", "Greetings", "Time & Date", "Occupations", "Eating Out", "Direction & Places", "Travelling", "Shopping", "Health"};
    String translationYoruba[] = {"nọmba", "ahbidi", "unrẹrẹ", "ebi", "awọ", "eranko", "body apa", "ikini", "akoko ati ọjọ", "ojúṣe", "njẹ jade", "itọsọna ati ibi", "rin", "ohun tio wa", "ilera"};

    String courseContentHausa[] = {"Numbers", "Alphabet", "Fruits", "Family", "Colours", "Animals", "Body Parts", "Greetings", "Time & Date", "Occupations", "Eating Out", "Direction & Places", "Travelling", "Shopping", "Health"};
    String translationHausa[] = {"lambar", "haruffa", "'Ya'yan itãcen marmari", "iyali", "launi", "dabba", "jiki sashi", "gaisuwa", "lokaci da kwanan wata", "zama", "cin abinci a waje", "shugabanci da kuma wuraren", "tafiya", "Shopping", "kiwon lafiya"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_work);

        final ListView course_list = (ListView) findViewById(R.id.list_of_courses);
        TextView language = (TextView) findViewById(R.id.language_lesson);

        if (MainActivity.language_selected == "Igbo"){
            language.setText("Igbo Language");
            CourseCustomAdapter customAdapter = new CourseCustomAdapter (getApplicationContext(), courseContentIgbo, translationIgbo, image, icon);
            course_list.setAdapter(customAdapter);
        }
        else if(MainActivity.language_selected == "Hausa"){
            language.setText("Hausa Language");
            CourseCustomAdapter customAdapter = new CourseCustomAdapter (getApplicationContext(), courseContentHausa, translationHausa, image, icon);
            course_list.setAdapter(customAdapter);
        }
        else{
            language.setText("Yoruba Language");
            CourseCustomAdapter customAdapter = new CourseCustomAdapter (getApplicationContext(), courseContentYoruba, translationYoruba, image, icon);
            course_list.setAdapter(customAdapter);
        }

        course_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                item = (String) ((TextView) view.findViewById(R.id.textView1)).getText();
                if (item == "numbers" || item == "mkpụrụ Okwu" || item == "mkpụrụ osisi" || item == "ezinụlọ" || item ==
                        "agba" || item == "anụmanụ" || item == "ahu so" || item == "ekele" || item ==
                        "oge na ụbọchị" || item == "arụ" || item == "eri si" || item == "direction na ebe" || item ==
                        "ejegharị ejegharị" || item == "shopping" || item == "ahụ ike" ){
                    Intent i = new Intent(CourseWork.this, Igbo.class);
                    startActivity(i);
                }
                else if (item == "nọmba" || item == "ahbidi" || item == "unrẹrẹ"|| item == "ọrọ" || item == "ebi" || item ==
                        "awọ" || item == "eranko" || item == "body apa" || item == "ikini" || item ==
                        "akoko ati ọjọ" || item == "ojúṣe" || item == "njẹ jade" || item == "itọsọna ati ibi" || item ==
                        "rin" || item == "ohun tio wa" || item == "ilera"){
                    Intent i = new Intent(CourseWork.this, Yoruba.class);
                    startActivity(i);
                }
                else{
                    Intent i = new Intent(CourseWork.this, Hausa.class);
                    startActivity(i);
                }
            }
        });
    }


}
