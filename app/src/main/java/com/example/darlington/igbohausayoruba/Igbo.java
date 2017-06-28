package com.example.darlington.igbohausayoruba;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Igbo extends AppCompatActivity {

    ListView detailsList;
    ArrayList<ContentDetails> details;
    int soundIcon = R.drawable.sound_icon;
    ArrayList<ContentDetails> detailsWithoutImgs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_igbo);
        detailsList = (ListView) findViewById(R.id.igboList);
        TextView headerIgbo = (TextView) findViewById(R.id.text_view_igbo);
        details = new ArrayList<ContentDetails>();
        detailsWithoutImgs = new ArrayList<ContentDetails>();

        if (CourseWork.item == "numbers"){
            headerIgbo.setText(R.string.number);
            ContentDetails detail0 = new ContentDetails(R.drawable.img0, "Zero", "adigi", soundIcon, R.raw.i0);
            ContentDetails detail1 = new ContentDetails(R.drawable.img1, "One", "Otu", soundIcon, R.raw.ione);
            ContentDetails detail2 = new ContentDetails(R.drawable.img2, "Two", "abụọ", soundIcon, R.raw.itwo);
            ContentDetails detail3 = new ContentDetails(R.drawable.img3, "Three", "atọ", soundIcon, R.raw.ithree);
            ContentDetails detail4 = new ContentDetails(R.drawable.img4, "Four", "ano", soundIcon, R.raw.i4);
            ContentDetails detail5 = new ContentDetails(R.drawable.img5, "Five", "ise", soundIcon, R.raw.i5);
            ContentDetails detail6 = new ContentDetails(R.drawable.img6, "Six", "isii", soundIcon, R.raw.i6);
            ContentDetails detail7 = new ContentDetails(R.drawable.img7, "Seven", "asaa", soundIcon, R.raw.i7);
            ContentDetails detail8 = new ContentDetails(R.drawable.img8, "Eight", "asatọ", soundIcon, R.raw.ieight);
            ContentDetails detail9 = new ContentDetails(R.drawable.img9, "Nine", "na itoolu", soundIcon, R.raw.inine);
            ContentDetails detail10 = new ContentDetails(R.drawable.img10, "Ten", "iri", soundIcon, R.raw.iten);

            ContentDetails detail11 = new ContentDetails(R.drawable.img11, "Eleven", "iri na otu", soundIcon, R.raw.i11);
            ContentDetails detail12 = new ContentDetails(R.drawable.img12, "Twelve", "iri na abụọ", soundIcon, R.raw.i12);
            ContentDetails detail13 = new ContentDetails(R.drawable.img13, "Thirteen", "iri na atọ", soundIcon, R.raw.i13);
            ContentDetails detail14 = new ContentDetails(R.drawable.img14, "Fourteen", "iri na ano", soundIcon, R.raw.i14);
            ContentDetails detail15 = new ContentDetails(R.drawable.img15, "Fifteen", "iri na ise", soundIcon, R.raw.i15);
            ContentDetails detail16 = new ContentDetails(R.drawable.img16, "Sixteen", "iri na isii", soundIcon, R.raw.i16);
            ContentDetails detail17 = new ContentDetails(R.drawable.img17, "Seventeen", "iri na asaa", soundIcon, R.raw.i17);
            ContentDetails detail18 = new ContentDetails(R.drawable.img18, "Eighteen", "iri na asatọ", soundIcon, R.raw.i18);
            ContentDetails detail19 = new ContentDetails(R.drawable.img19, "Nineteen", "iri na itoolu", soundIcon, R.raw.i19);
            ContentDetails detail20 = new ContentDetails(R.drawable.img20, "Twenty", "ogụ", soundIcon, R.raw.i20);
            ContentDetails detail21 = new ContentDetails(R.drawable.img21, "Twenty one", "ogụ na Otu", soundIcon, R.raw.i21);
            ContentDetails detail22 = new ContentDetails(R.drawable.img22, "Twenty two", "ogụ na abụọ", soundIcon, R.raw.i22);
            ContentDetails detail23 = new ContentDetails(R.drawable.img23, "Twenty three", "ogụ na atọ", soundIcon, R.raw.i23);
            ContentDetails detail24 = new ContentDetails(R.drawable.img24, " Twenty four", "ogụ na ano", soundIcon, R.raw.i24);
            ContentDetails detail25 = new ContentDetails(R.drawable.img25, " Twenty five", "ogụ na ise", soundIcon, R.raw.i25);
            ContentDetails detail26 = new ContentDetails(R.drawable.img26, " Twenty six", "ogụ na isii", soundIcon, R.raw.i26);
            ContentDetails detail27 = new ContentDetails(R.drawable.img27, " Twenty seven", "ogụ na asaa", soundIcon, R.raw.i27);
            ContentDetails detail28 = new ContentDetails(R.drawable.img28, "Twenty eight", "ogụ na asatọ", soundIcon, R.raw.i28);
            ContentDetails detail29 = new ContentDetails(R.drawable.img29, "Twenty nine", "ogụ na itoolu", soundIcon, R.raw.i29);
            ContentDetails detail30 = new ContentDetails(R.drawable.img30, "Thirty", "ogụ na iri", soundIcon, R.raw.i30);
            details.add(detail0);
            details.add(detail1);
            details.add(detail2);
            details.add(detail3);
            details.add(detail4);
            details.add(detail5);
            details.add(detail6);
            details.add(detail7);
            details.add(detail8);
            details.add(detail9);
            details.add(detail10);
            details.add(detail11);
            details.add(detail12);
            details.add(detail13);
            details.add(detail14);
            details.add(detail15);
            details.add(detail16);
            details.add(detail17);
            details.add(detail18);
            details.add(detail19);
            details.add(detail20);
            details.add(detail21);
            details.add(detail22);
            details.add(detail23);
            details.add(detail24);
            details.add(detail25);
            details.add(detail26);
            details.add(detail27);
            details.add(detail28);
            details.add(detail29);
            details.add(detail30);
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Igbo.this, details));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, details.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else if (CourseWork.item == "mkpụrụ Okwu"){
            headerIgbo.setText(R.string.alphabet);
            ContentDetails detail1 = new ContentDetails(R.drawable.a, "A", "A a", soundIcon, R.raw.ione);
            ContentDetails detail2 = new ContentDetails(R.drawable.b, "B", "B b", soundIcon, R.raw.ione);
            ContentDetails detail3 = new ContentDetails(R.drawable.c, "C", "CH ch", soundIcon, R.raw.ione);
            ContentDetails detail4 = new ContentDetails(R.drawable.d, "D", "D d", soundIcon, R.raw.ione);
            ContentDetails detail5 = new ContentDetails(R.drawable.e, "E", "E e", soundIcon, R.raw.ione);
            ContentDetails detail6 = new ContentDetails(R.drawable.f, "F", "F f", soundIcon, R.raw.ione);
            ContentDetails detail7 = new ContentDetails(R.drawable.g, "G", "G g", soundIcon, R.raw.ione);
            ContentDetails detail8 = new ContentDetails(R.drawable.g, "G", "GB gb", soundIcon, R.raw.ione);
            ContentDetails detail9 = new ContentDetails(R.drawable.g, "G", "GH gh", soundIcon, R.raw.ione);
            ContentDetails detail10 = new ContentDetails(R.drawable.g, "G", "GW gw", soundIcon, R.raw.ione);
            ContentDetails detail11 = new ContentDetails(R.drawable.h, "H", "H h", soundIcon, R.raw.ione);
            ContentDetails detail12 = new ContentDetails(R.drawable.i, "I", "I i", soundIcon, R.raw.ione);
            ContentDetails detail13 = new ContentDetails(R.drawable.i, "I", "Ị ị", soundIcon, R.raw.ione);
            ContentDetails detail14 = new ContentDetails(R.drawable.j, "J", "J j", soundIcon, R.raw.ione);
            ContentDetails detail15 = new ContentDetails(R.drawable.k, "K", "K k", soundIcon, R.raw.ione);
            ContentDetails detail16 = new ContentDetails(R.drawable.k, "K", "KP kp", soundIcon, R.raw.ione);
            ContentDetails detail17 = new ContentDetails(R.drawable.k, "K", "KW kw", soundIcon, R.raw.ione);
            ContentDetails detail18 = new ContentDetails(R.drawable.letter_l, "L", "L l", soundIcon, R.raw.ione);
            ContentDetails detail19 = new ContentDetails(R.drawable.m, "M", "M m", soundIcon, R.raw.ione);
            ContentDetails detail20 = new ContentDetails(R.drawable.n, "N", "N n", soundIcon, R.raw.ione);
            ContentDetails detail21 = new ContentDetails(R.drawable.n, "N", "Ń ń", soundIcon, R.raw.ione);
            ContentDetails detail22 = new ContentDetails(R.drawable.n, "N", "NW nw", soundIcon, R.raw.ione);
            ContentDetails detail23 = new ContentDetails(R.drawable.n, "N", "NY ny", soundIcon, R.raw.ione);
            ContentDetails detail24 = new ContentDetails(R.drawable.o, "O", "O o", soundIcon, R.raw.ione);
            ContentDetails detail25 = new ContentDetails(R.drawable.o, "O", "Ọ ọ", soundIcon, R.raw.ione);
            ContentDetails detail26 = new ContentDetails(R.drawable.o, "P", "P p", soundIcon, R.raw.ione);
            ContentDetails detail27 = new ContentDetails(R.drawable.r, "R", "R r", soundIcon, R.raw.ione);
            ContentDetails detail28 = new ContentDetails(R.drawable.s, "S", "S s", soundIcon, R.raw.ione);
            ContentDetails detail29 = new ContentDetails(R.drawable.s, "S", "SH sh", soundIcon, R.raw.ione);
            ContentDetails detail30 = new ContentDetails(R.drawable.t, "T", "T t", soundIcon, R.raw.ione);
            ContentDetails detail31 = new ContentDetails(R.drawable.u, "U", "U u", soundIcon, R.raw.ione);
            ContentDetails detail32 = new ContentDetails(R.drawable.u, "U", "Ụ ụ", soundIcon, R.raw.ione);
            ContentDetails detail33 = new ContentDetails(R.drawable.v, "V", "V v", soundIcon, R.raw.ione);
            ContentDetails detail34 = new ContentDetails(R.drawable.w, "W", "W w", soundIcon, R.raw.ione);
            ContentDetails detail35 = new ContentDetails(R.drawable.y, "Y", "Z z", soundIcon, R.raw.ione);
            ContentDetails detail36 = new ContentDetails(R.drawable.z, "Z", "Z", soundIcon, R.raw.ione);
            details.add(detail1);
            details.add(detail2);
            details.add(detail3);
            details.add(detail4);
            details.add(detail5);
            details.add(detail6);
            details.add(detail7);
            details.add(detail8);
            details.add(detail9);
            details.add(detail10);
            details.add(detail11);
            details.add(detail12);
            details.add(detail13);
            details.add(detail14);
            details.add(detail15);
            details.add(detail16);
            details.add(detail17);
            details.add(detail18);
            details.add(detail19);
            details.add(detail20);
            details.add(detail21);
            details.add(detail22);
            details.add(detail23);
            details.add(detail24);
            details.add(detail25);
            details.add(detail26);
            details.add(detail27);
            details.add(detail28);
            details.add(detail29);
            details.add(detail30);
            details.add(detail31);
            details.add(detail32);
            details.add(detail33);
            details.add(detail34);
            details.add(detail35);
            details.add(detail36);
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Igbo.this, details));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, details.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else if (CourseWork.item == "mkpụrụ osisi"){
            headerIgbo.setText("Fruits");
            ContentDetails detail1 = new ContentDetails(R.drawable.apple, "Apple", "apụl", soundIcon, R.raw.iapple);
            ContentDetails detail2 = new ContentDetails(R.drawable.banana, "Banana", "ogede", soundIcon, R.raw.ibanana);
            ContentDetails detail3 = new ContentDetails(R.drawable.coconut, "Coconut", "akụ oyibo", soundIcon, R.raw.icoconut);
            ContentDetails detail4 = new ContentDetails(R.drawable.garden_egg, "Garden egg", "afufa", soundIcon, R.raw.ione);
            ContentDetails detail5 = new ContentDetails(R.drawable.mango, "Mango", "mango", soundIcon, R.raw.imango);
            ContentDetails detail6 = new ContentDetails(R.drawable.orange, "Orange", "oroma", soundIcon, R.raw.iorange);
            ContentDetails detail7 = new ContentDetails(R.drawable.pear, "Pear", "ube", soundIcon, R.raw.ipear);
            ContentDetails detail8 = new ContentDetails(R.drawable.water_melon, "Water melon", "anyụ", soundIcon, R.raw.iwatermelon);
            ContentDetails detail9 = new ContentDetails(R.drawable.pineapple, "Pine apple", "ọkwụrụ bekee", soundIcon, R.raw.ipineapple);
            ContentDetails detail10 = new ContentDetails(R.drawable.kola, "Kola nut", "ogi", soundIcon, R.raw.ikola);
            ContentDetails detail11 = new ContentDetails(R.drawable.lemon, "Lemon", "oroma nkịrịsị", soundIcon, R.raw.ilemon);
            ContentDetails detail12 = new ContentDetails(R.drawable.guava, "Guava", "Guava", soundIcon, R.raw.iguava);
            ContentDetails detail13 = new ContentDetails(R.drawable.tangerine, "Tangerine", "tanjerịn", soundIcon, R.raw.itangerine);
            details.add(detail1);
            details.add(detail2);
            details.add(detail3);
            details.add(detail4);
            details.add(detail5);
            details.add(detail6);
            details.add(detail7);
            details.add(detail8);
            details.add(detail9);
            details.add(detail10);
            details.add(detail11);
            details.add(detail12);
            details.add(detail13);
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Igbo.this, details));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, details.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else if (CourseWork.item == "ezinụlọ"){
            headerIgbo.setText(R.string.family);
            ContentDetails detail1 = new ContentDetails(R.drawable.husband_wife, "Husband", "di", soundIcon, R.raw.ihusband);
            ContentDetails detail2 = new ContentDetails(R.drawable.husband_wife, "Wife", "nwunye", soundIcon, R.raw.iwife);
            ContentDetails detail3 = new ContentDetails(R.drawable.dad, "Father/Dad", "nna", soundIcon, R.raw.idad);
            ContentDetails detail4 = new ContentDetails(R.drawable.mother, "Mother/Mum", "nne", soundIcon, R.raw.imum);
            ContentDetails detail5 = new ContentDetails(R.drawable.grand_dad, "Grand Father", "akwa Nna", soundIcon, R.raw.igranddad);
            ContentDetails detail6 = new ContentDetails(R.drawable.grand_mum, "Grand Mother", "akwa Nne", soundIcon, R.raw.igrandmum);
            ContentDetails detail7 = new ContentDetails(R.drawable.brother, "brother", "nwanne nwoke", soundIcon, R.raw.ibro);
            ContentDetails detail8 = new ContentDetails(R.drawable.sister, "Sister", "nwanne nwaanyị", soundIcon, R.raw.isis);
            ContentDetails detail9 = new ContentDetails(R.drawable.big_bro, "Elder Brother", "nnukwu nwanne nwoke", soundIcon, R.raw.ibigbro);
            ContentDetails detail10 = new ContentDetails(R.drawable.big_sis, "Elder Sister", "nnukwu nwanne nwaanyi", soundIcon, R.raw.ibigsis);
            ContentDetails detail11 = new ContentDetails(R.drawable.family, "Siblings", "ụmụnne", soundIcon, R.raw.isiblings);
            ContentDetails detail12 = new ContentDetails(R.drawable.uncle, "Uncle", "nwanne nna", soundIcon, R.raw.iuncle);
            ContentDetails detail13 = new ContentDetails(R.drawable.aunt, "Aunt", "nwanne mama", soundIcon, R.raw.iaunt);
            details.add(detail1);
            details.add(detail2);
            details.add(detail3);
            details.add(detail4);
            details.add(detail5);
            details.add(detail6);
            details.add(detail7);
            details.add(detail8);
            details.add(detail9);
            details.add(detail10);
            details.add(detail11);
            details.add(detail12);
            details.add(detail13);
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Igbo.this, details));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, details.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else if (CourseWork.item == "agba"){
            headerIgbo.setText(R.string.colours);
            ContentDetails detail1 = new ContentDetails(R.drawable.white, "White", "ọcha", soundIcon, R.raw.iwhite);
            ContentDetails detail2 = new ContentDetails(R.drawable.black, "Black", "oji", soundIcon, R.raw.iblack);
            ContentDetails detail3 = new ContentDetails(R.drawable.blue, "Blue", "acha anụnụ anụnụ", soundIcon, R.raw.iblue);
            ContentDetails detail4 = new ContentDetails(R.drawable.orange, "Orange", "oroma", soundIcon, R.raw.iorange);
            ContentDetails detail5 = new ContentDetails(R.drawable.red, "Red", "Uhie", soundIcon, R.raw.ired);
            ContentDetails detail6 = new ContentDetails(R.drawable.green, "Green", "Ndu Ndu", soundIcon, R.raw.igreen);
            ContentDetails detail7 = new ContentDetails(R.drawable.grey, "Grey", "Ucha nzu", soundIcon, R.raw.igrey);
            ContentDetails detail8 = new ContentDetails(R.drawable.purple, "Purple", "odo odo", soundIcon, R.raw.ipurple);
            ContentDetails detail9 = new ContentDetails(R.drawable.yellow, "Yellow", "Edo", soundIcon, R.raw.iyellow);
            details.add(detail1);
            details.add(detail2);
            details.add(detail3);
            details.add(detail4);
            details.add(detail5);
            details.add(detail6);
            details.add(detail7);
            details.add(detail8);
            details.add(detail9);
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Igbo.this, details));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, details.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else if (CourseWork.item == "anụmanụ"){
            headerIgbo.setText(R.string.animals);
            ContentDetails detail1 = new ContentDetails(R.drawable.dog, "Dog", "nkịta", soundIcon, R.raw.idog);
            ContentDetails detail2 = new ContentDetails(R.drawable.goat, "Goat", "ewu", soundIcon, R.raw.igoat);
            ContentDetails detail3 = new ContentDetails(R.drawable.chicken, "Chicken", "ọkụkọ", soundIcon, R.raw.ichicken);
            ContentDetails detail4 = new ContentDetails(R.drawable.sheep, "Sheep", "aturu", soundIcon, R.raw.isheep);
            ContentDetails detail5 = new ContentDetails(R.drawable.cow, "Cow", "ehi", soundIcon, R.raw.icow);
            ContentDetails detail6 = new ContentDetails(R.drawable.rabbit, "Rabbit", "oke oyibo", soundIcon, R.raw.irabbit);
            ContentDetails detail7 = new ContentDetails(R.drawable.birds, "Birds", "nnụnụ", soundIcon, R.raw.ibird);
            ContentDetails detail8 = new ContentDetails(R.drawable.snake, "Snakes", "agwọ", soundIcon, R.raw.isnake);
            ContentDetails detail9 = new ContentDetails(R.drawable.mosquito, "Mosquito", "anwụnta", soundIcon, R.raw.imosquito);
            ContentDetails detail10 = new ContentDetails(R.drawable.lion, "Lion", "ọdụm", soundIcon, R.raw.ilion);
            ContentDetails detail11 = new ContentDetails(R.drawable.elephant, "Elephant", "elephant", soundIcon, R.raw.ielephant);
            details.add(detail1);
            details.add(detail2);
            details.add(detail3);
            details.add(detail4);
            details.add(detail5);
            details.add(detail6);
            details.add(detail7);
            details.add(detail8);
            details.add(detail9);
            details.add(detail10);
            details.add(detail11);
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Igbo.this, details));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, details.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else if (CourseWork.item == "ahu so"){
            headerIgbo.setText(R.string.body_parts);
            ContentDetails detail1 = new ContentDetails(R.drawable.head, "Head", "isi", soundIcon, R.raw.ihead);
            ContentDetails detail2 = new ContentDetails(R.drawable.eye, "Eye", "anya", soundIcon, R.raw.ieye);
            ContentDetails detail3 = new ContentDetails(R.drawable.nose, "Nose", "imi", soundIcon, R.raw.inose);
            ContentDetails detail4 = new ContentDetails(R.drawable.mouth, "Mouth", "ọnụ", soundIcon, R.raw.imouth);
            ContentDetails detail5 = new ContentDetails(R.drawable.ear, "Ear", "ntị", soundIcon, R.raw.iear);
            ContentDetails detail6 = new ContentDetails(R.drawable.hand, "Hand", "aka", soundIcon, R.raw.ihand);
            ContentDetails detail7 = new ContentDetails(R.drawable.leg, "Leg", "ụkwụ", soundIcon, R.raw.ileg);
            ContentDetails detail8 = new ContentDetails(R.drawable.tongue, "Tongue", "ire", soundIcon, R.raw.itongue);
            ContentDetails detail9 = new ContentDetails(R.drawable.buttock, "Buttock", "ike", soundIcon, R.raw.ibutt);
            details.add(detail1);
            details.add(detail2);
            details.add(detail3);
            details.add(detail4);
            details.add(detail5);
            details.add(detail6);
            details.add(detail7);
            details.add(detail8);
            details.add(detail9);
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Igbo.this, details));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, details.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else if (CourseWork.item == "ekele"){
            headerIgbo.setText(R.string.greetings);
            ContentDetails detail1 = new ContentDetails("Welcome", "Nnọọ", soundIcon, R.raw.ione);
            ContentDetails detail2 = new ContentDetails("Good Morning", "ụtụtụ ọma", soundIcon, R.raw.ione);
            ContentDetails detail3 = new ContentDetails("Good Afternoon", "ehihie ọma", soundIcon, R.raw.ione);
            ContentDetails detail4 = new ContentDetails("Good Night", "ka chifoo", soundIcon, R.raw.ione);
            ContentDetails detail5 = new ContentDetails("Good day", "ụbọchị ọma", soundIcon, R.raw.igoat);
            ContentDetails detail6 = new ContentDetails("Goodbye", "ka ọ dị", soundIcon, R.raw.igoat);
            ContentDetails detail7 = new ContentDetails("Thank You", "dalụ", soundIcon, R.raw.ione);
            ContentDetails detail8 = new ContentDetails("Hello", "kedụ", soundIcon, R.raw.ione);
            ContentDetails detail9 = new ContentDetails("How are you?", "kedụ ka ịmere?", soundIcon, R.raw.ione);
            detailsWithoutImgs.add(detail1);
            detailsWithoutImgs.add(detail2);
            detailsWithoutImgs.add(detail3);
            detailsWithoutImgs.add(detail4);
            detailsWithoutImgs.add(detail5);
            detailsWithoutImgs.add(detail6);
            detailsWithoutImgs.add(detail7);
            detailsWithoutImgs.add(detail8);
            detailsWithoutImgs.add(detail9);
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Igbo.this, detailsWithoutImgs));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, detailsWithoutImgs.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else if (CourseWork.item == "oge na ụbọchị"){
            headerIgbo.setText(R.string.time_date);
            ContentDetails detail1 = new ContentDetails("Morning", "ụtụtụ", soundIcon, R.raw.ione);
            ContentDetails detail2 = new ContentDetails("Afternoon", "ehihie", soundIcon, R.raw.igoat);
            ContentDetails detail3 = new ContentDetails("Evening", "abalị", soundIcon, R.raw.ione);
            ContentDetails detail4 = new ContentDetails("Night", "anyasi", soundIcon, R.raw.isoup);
            ContentDetails detail5 = new ContentDetails("Raining season", "mmiri na-ezo oge", soundIcon, R.raw.ione);
            ContentDetails detail6 = new ContentDetails("Dry season", "ọkọchị", soundIcon, R.raw.idessert);
            ContentDetails detail7 = new ContentDetails("Time", "oge", soundIcon, R.raw.iapperizer);
            ContentDetails detail8 = new ContentDetails("Second", "sekọnd", soundIcon, R.raw.ione);
            ContentDetails detail9 = new ContentDetails("Minute", "nkeji", soundIcon, R.raw.i_how_much);
            ContentDetails detail10 = new ContentDetails("Hour", "awa", soundIcon, R.raw.imore_please);
            ContentDetails detail11 = new ContentDetails("Day", "ụbọchị", soundIcon, R.raw.ione);
            ContentDetails detail12 = new ContentDetails("Tomorrow", "echi", soundIcon, R.raw.idessert);
            ContentDetails detail13 = new ContentDetails("Next tomorrow", "nwanne echi", soundIcon, R.raw.iapperizer);
            ContentDetails detail14 = new ContentDetails("Yesterday", "ụnyaahụ", soundIcon, R.raw.ione);
            ContentDetails detail15 = new ContentDetails("Next week", "izu na-esote", soundIcon, R.raw.i_how_much);
            ContentDetails detail16 = new ContentDetails("Last week", "izu gara aga", soundIcon, R.raw.imore_please);
            detailsWithoutImgs.add(detail1);
            detailsWithoutImgs.add(detail2);
            detailsWithoutImgs.add(detail3);
            detailsWithoutImgs.add(detail4);
            detailsWithoutImgs.add(detail5);
            detailsWithoutImgs.add(detail6);
            detailsWithoutImgs.add(detail7);
            detailsWithoutImgs.add(detail8);
            detailsWithoutImgs.add(detail9);
            detailsWithoutImgs.add(detail10);
            detailsWithoutImgs.add(detail11);
            detailsWithoutImgs.add(detail12);
            detailsWithoutImgs.add(detail13);
            detailsWithoutImgs.add(detail14);
            detailsWithoutImgs.add(detail15);
            detailsWithoutImgs.add(detail16);
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Igbo.this, detailsWithoutImgs));
        }
        else if (CourseWork.item == "arụ"){
            headerIgbo.setText(R.string.occupation);
            ContentDetails detail1 = new ContentDetails(R.drawable.engineer, "Engineer", "engineer", soundIcon, R.raw.iengineer);
            ContentDetails detail2 = new ContentDetails(R.drawable.doctor, "Doctor", "dọkịta", soundIcon, R.raw.idoctor);
            ContentDetails detail3 = new ContentDetails(R.drawable.programmer, "Programmer", "programmer", soundIcon, R.raw.iprogrammer);
            ContentDetails detail4 = new ContentDetails(R.drawable.cook, "Cook", "na-esi nri", soundIcon, R.raw.icook);
            ContentDetails detail5 = new ContentDetails(R.drawable.photographer, "Photographer", "echebe", soundIcon, R.raw.iphotographer);
            ContentDetails detail6 = new ContentDetails(R.drawable.big_sis, "Secretary", "odeakwụkwọ", soundIcon, R.raw.ione);
            ContentDetails detail7 = new ContentDetails(R.drawable.student, "Student", "ụmu akukwo", soundIcon, R.raw.istudent);
            ContentDetails detail8 = new ContentDetails(R.drawable.teacher, "Teacher", "onye nkụzi", soundIcon, R.raw.iteacher);
            ContentDetails detail9 = new ContentDetails(R.drawable.nurse, "Nurse", "nurse", soundIcon, R.raw.inurse);
            ContentDetails detail10 = new ContentDetails(R.drawable.lawyer, "Lawyer", "ọkàiwu", soundIcon, R.raw.ilawyer);
            ContentDetails detail11 = new ContentDetails(R.drawable.dentist, "Dentist", "dibia", soundIcon, R.raw.identist);
            ContentDetails detail12 = new ContentDetails(R.drawable.soldier, "Soldier", "agha nmadu", soundIcon, R.raw.isoldier);
            details.add(detail1);
            details.add(detail2);
            details.add(detail3);
            details.add(detail4);
            details.add(detail5);
            details.add(detail6);
            details.add(detail7);
            details.add(detail8);
            details.add(detail9);
            details.add(detail10);
            details.add(detail11);
            details.add(detail12);
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Igbo.this, details));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, details.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else if (CourseWork.item == "eri si"){
            headerIgbo.setText(R.string.eating_out);
            ContentDetails detail1 = new ContentDetails("Breakfast", "nri ụtụtụ", soundIcon, R.raw.ione);
            ContentDetails detail2 = new ContentDetails("Lunch", "nri ehihie", soundIcon, R.raw.igoat);
            ContentDetails detail3 = new ContentDetails("Dinner/Supper", "nri abalị", soundIcon, R.raw.ione);
            ContentDetails detail4 = new ContentDetails("Soup", "ofe", soundIcon, R.raw.isoup);
            ContentDetails detail5 = new ContentDetails("Main dish", "isi nri", soundIcon, R.raw.ione);
            ContentDetails detail6 = new ContentDetails("Dessert", "eji megharịa ọnụ", soundIcon, R.raw.idessert);
            ContentDetails detail7 = new ContentDetails("Appetizer", "appetizer", soundIcon, R.raw.iapperizer);
            ContentDetails detail8 = new ContentDetails("I am famished", "ana m nọrọ agụụ", soundIcon, R.raw.ione);
            ContentDetails detail9 = new ContentDetails("How much?", "ego ole?", soundIcon, R.raw.i_how_much);
            ContentDetails detail10 = new ContentDetails("More, please", "ọzọ, biko", soundIcon, R.raw.imore_please);
            detailsWithoutImgs.add(detail1);
            detailsWithoutImgs.add(detail2);
            detailsWithoutImgs.add(detail3);
            detailsWithoutImgs.add(detail4);
            detailsWithoutImgs.add(detail5);
            detailsWithoutImgs.add(detail6);
            detailsWithoutImgs.add(detail7);
            detailsWithoutImgs.add(detail8);
            detailsWithoutImgs.add(detail9);
            detailsWithoutImgs.add(detail10);
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Igbo.this, detailsWithoutImgs));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, detailsWithoutImgs.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else if (CourseWork.item == "direction na ebe"){
            headerIgbo.setText(R.string.direction);
            ContentDetails detail1 = new ContentDetails("Directions", "ntụziaka / Uzo", soundIcon, R.raw.ione);
            ContentDetails detail2 = new ContentDetails("Go straight", "Gaa ihu ogologo", soundIcon, R.raw.igoat);
            ContentDetails detail3 = new ContentDetails("Turn right", "Tụgharịa aka nri", soundIcon, R.raw.ione);
            ContentDetails detail4 = new ContentDetails("Turn left", "Tụgharịa aka ekpe", soundIcon, R.raw.isoup);
            ContentDetails detail5 = new ContentDetails("come back", "nachia azụ", soundIcon, R.raw.ione);
            ContentDetails detail6 = new ContentDetails("Go", "gaa", soundIcon, R.raw.idessert);
            ContentDetails detail7 = new ContentDetails("Church", "ụlọ ụka", soundIcon, R.raw.iapperizer);
            ContentDetails detail8 = new ContentDetails("School", "ụlọ akwụkwọ", soundIcon, R.raw.ione);
            ContentDetails detail9 = new ContentDetails("Bank", "ụlọ akụ", soundIcon, R.raw.i_how_much);
            ContentDetails detail10 = new ContentDetails("Police station", "uwe ojii", soundIcon, R.raw.imore_please);
            ContentDetails detail11 = new ContentDetails("Follow", "na-eso", soundIcon, R.raw.ione);
            ContentDetails detail12 = new ContentDetails("Behind", "n'azụ", soundIcon, R.raw.idessert);
            detailsWithoutImgs.add(detail1);
            detailsWithoutImgs.add(detail2);
            detailsWithoutImgs.add(detail3);
            detailsWithoutImgs.add(detail4);
            detailsWithoutImgs.add(detail5);
            detailsWithoutImgs.add(detail6);
            detailsWithoutImgs.add(detail7);
            detailsWithoutImgs.add(detail8);
            detailsWithoutImgs.add(detail9);
            detailsWithoutImgs.add(detail10);
            detailsWithoutImgs.add(detail11);
            detailsWithoutImgs.add(detail12);
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Igbo.this, detailsWithoutImgs));
        }
        else if (CourseWork.item == "ejegharị ejegharị"){
            headerIgbo.setText(R.string.travelling);
            ContentDetails detail1 = new ContentDetails("Bus", "ụgbọ ala", soundIcon, R.raw.igoat);
            ContentDetails detail2 = new ContentDetails("Taxi/Cab", "taxi", soundIcon, R.raw.igoat);
            ContentDetails detail3 = new ContentDetails("Train", "ụgbọ okporo ígwè", soundIcon, R.raw.igoat);
            ContentDetails detail4 = new ContentDetails("Plane", "ụgbọelu", soundIcon, R.raw.igoat);
            ContentDetails detail5 = new ContentDetails("Baggage", "ibu", soundIcon, R.raw.igoat);
            ContentDetails detail6 = new ContentDetails("Ticket", "tiketi", soundIcon, R.raw.igoat);
            ContentDetails detail7 = new ContentDetails("Passport", "paspọtụ", soundIcon, R.raw.igoat);
            ContentDetails detail8 = new ContentDetails("Airport", "ọdụ ụgbọ elu", soundIcon, R.raw.igoat);
            ContentDetails detail9 = new ContentDetails("Seat", "oche", soundIcon, R.raw.igoat);
            ContentDetails detail10 = new ContentDetails("Entrance", "Ụzọ mbata", soundIcon, R.raw.igoat);
            ContentDetails detail11 = new ContentDetails("Exit", "ụzọ ọpụpụ", soundIcon, R.raw.igoat);
            ContentDetails detail12 = new ContentDetails("Boat/Ship", "ụgbọ mmiri", soundIcon, R.raw.igoat);
            detailsWithoutImgs.add(detail1);
            detailsWithoutImgs.add(detail2);
            detailsWithoutImgs.add(detail3);
            detailsWithoutImgs.add(detail4);
            detailsWithoutImgs.add(detail5);
            detailsWithoutImgs.add(detail6);
            detailsWithoutImgs.add(detail7);
            detailsWithoutImgs.add(detail8);
            detailsWithoutImgs.add(detail9);
            detailsWithoutImgs.add(detail10);
            detailsWithoutImgs.add(detail11);
            detailsWithoutImgs.add(detail12);
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Igbo.this, detailsWithoutImgs));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, detailsWithoutImgs.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else if (CourseWork.item == "shopping"){
            headerIgbo.setText(R.string.shopping);
            ContentDetails detail1 = new ContentDetails("Money", "ego", soundIcon, R.raw.imoney);
            ContentDetails detail2 = new ContentDetails("Credit card", "kaadị credit", soundIcon, R.raw.icredit_card);
            ContentDetails detail3 = new ContentDetails("Clothes", "efe", soundIcon, R.raw.iclothes);
            ContentDetails detail4 = new ContentDetails("Groceries", "adaa n'ala", soundIcon, R.raw.igroceries);
            ContentDetails detail5 = new ContentDetails("Shopping center", "shopping center", soundIcon, R.raw.ishopping_center);
            ContentDetails detail6 = new ContentDetails("Super market", "ahịa", soundIcon, R.raw.i_super_market);
            ContentDetails detail7 = new ContentDetails("Pharmacy", "na-ere ọgwụ", soundIcon, R.raw.iphotographer);
            ContentDetails detail8 = new ContentDetails("Hat", "okpu", soundIcon, R.raw.i_hat);
            ContentDetails detail9 = new ContentDetails("Shirt", "uwe elu", soundIcon, R.raw.isheep);
            ContentDetails detail10 = new ContentDetails("Skirt", "uwe", soundIcon, R.raw.ishopping_center);
            ContentDetails detail11 = new ContentDetails("Shoes", "akpụkpọ ụkwụ", soundIcon, R.raw.ione);
            ContentDetails detail12 = new ContentDetails("Bags", "akpa", soundIcon, R.raw.ibag);
            ContentDetails detail13 = new ContentDetails("Large size", "nke nnukwu", soundIcon, R.raw.ibig_size);
            ContentDetails detail14 = new ContentDetails("Medium size", "nke na-ajụ", soundIcon, R.raw.isis);
            ContentDetails detail15 = new ContentDetails("Small size", "nke obere", soundIcon, R.raw.ismall_size);
            ContentDetails detail16 = new ContentDetails("Beautiful", "mara mma", soundIcon, R.raw.ibeautiful);
            ContentDetails detail17 = new ContentDetails("I will take it", "m ga-ewere ya", soundIcon, R.raw.i_i_will_take_it);
            ContentDetails detail18 = new ContentDetails("How much?", "ego ole?", soundIcon, R.raw.i_how_much);
            detailsWithoutImgs.add(detail1);
            detailsWithoutImgs.add(detail2);
            detailsWithoutImgs.add(detail3);
            detailsWithoutImgs.add(detail4);
            detailsWithoutImgs.add(detail5);
            detailsWithoutImgs.add(detail6);
            detailsWithoutImgs.add(detail7);
            detailsWithoutImgs.add(detail8);
            detailsWithoutImgs.add(detail9);
            detailsWithoutImgs.add(detail10);
            detailsWithoutImgs.add(detail11);
            detailsWithoutImgs.add(detail12);
            detailsWithoutImgs.add(detail13);
            detailsWithoutImgs.add(detail14);
            detailsWithoutImgs.add(detail15);
            detailsWithoutImgs.add(detail16);
            detailsWithoutImgs.add(detail17);
            detailsWithoutImgs.add(detail18);
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Igbo.this, detailsWithoutImgs));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, detailsWithoutImgs.get(position).audioResourceIgbo);
                    num.start();
                }
            });
        }
        else{
            headerIgbo.setText(R.string.health);
            ContentDetails detail1 = new ContentDetails("Health", "ahụ ike", soundIcon, R.raw.ihead);
            ContentDetails detail2 = new ContentDetails("Drugs", "ọgwụ", soundIcon, R.raw.idessert);
            ContentDetails detail3 = new ContentDetails("Pharmacy", "ahịa ọgwụ", soundIcon, R.raw.igoat);
            ContentDetails detail4 = new ContentDetails("Blood", "ọbara", soundIcon, R.raw.igoat);
            ContentDetails detail5 = new ContentDetails("Disease", "ọrịa", soundIcon, R.raw.igoat);
            ContentDetails detail6 = new ContentDetails("Headache", "isi ọwụwa", soundIcon, R.raw.iheadache);
            ContentDetails detail7 = new ContentDetails("Stomach-ache", "afọ mgbu", soundIcon, R.raw.istomachpain);
            ContentDetails detail8 = new ContentDetails("Sick", "na-arịa ọrịa", soundIcon, R.raw.isick);
            ContentDetails detail9 = new ContentDetails("I am sick", "ahụ adịghị m", soundIcon, R.raw.iiamsick);
            ContentDetails detail10 = new ContentDetails("Call am Doctor", "Kpọọ dọkịta", soundIcon, R.raw.icalldoctor);
            ContentDetails detail11 = new ContentDetails("I need help", "a chọrọ m enyemaka", soundIcon, R.raw.iieedhelp);
            ContentDetails detail12 = new ContentDetails("I have an injury", "i nwere ihe ọjọọ", soundIcon, R.raw.iihaveaninjury);
            ContentDetails detail13 = new ContentDetails("I am dying", "m na-anwụ", soundIcon, R.raw.i_i_am_dying);
            ContentDetails detail14 = new ContentDetails("dead/death", "nwụrụ anwụ", soundIcon, R.raw.ideath);
            ContentDetails detail15 = new ContentDetails("Medicine", "ọgwụ", soundIcon, R.raw.imedicine);
            ContentDetails detail16 = new ContentDetails("Broken bones", "ọkpụkpụ gbajiri", soundIcon, R.raw.i_broken_bones);
            ContentDetails detail17 = new ContentDetails("Feeling better", "mmetụta mma", soundIcon, R.raw.i_feeling_better);
            ContentDetails detail18 = new ContentDetails("Feeling worse", "mmetụta njọ", soundIcon, R.raw.i_feeling_worse);
            detailsWithoutImgs.add(detail1);
            detailsWithoutImgs.add(detail2);
            detailsWithoutImgs.add(detail3);
            detailsWithoutImgs.add(detail4);
            detailsWithoutImgs.add(detail5);
            detailsWithoutImgs.add(detail6);
            detailsWithoutImgs.add(detail7);
            detailsWithoutImgs.add(detail8);
            detailsWithoutImgs.add(detail9);
            detailsWithoutImgs.add(detail10);
            detailsWithoutImgs.add(detail11);
            detailsWithoutImgs.add(detail12);
            detailsWithoutImgs.add(detail13);
            detailsWithoutImgs.add(detail14);
            detailsWithoutImgs.add(detail15);
            detailsWithoutImgs.add(detail16);
            detailsWithoutImgs.add(detail17);
            detailsWithoutImgs.add(detail18);
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Igbo.this, detailsWithoutImgs));
            detailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MediaPlayer num = MediaPlayer.create(Igbo.this, detailsWithoutImgs.get(position).audioResourceIgbo);
                    num.start();
                }
            });

    }
}}
