package com.example.darlington.igbohausayoruba;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Yoruba extends AppCompatActivity {

    ListView detailsList;
    ArrayList<ContentDetails> details;
    int soundIcon = R.drawable.sound_icon;
    ArrayList<ContentDetails> detailsWithoutImgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoruba);
        detailsList = (ListView) findViewById(R.id.yorubaList);
        TextView headerYoruba = (TextView) findViewById(R.id.text_view_yoruba);
        details = new ArrayList<ContentDetails>();
        detailsWithoutImgs = new ArrayList<ContentDetails>();

        if (CourseWork.item == "nọmba") {
            headerYoruba.setText(R.string.number);
            ContentDetails detail0 = new ContentDetails(R.drawable.img0, "Zero", "odo", soundIcon);
            ContentDetails detail1 = new ContentDetails(R.drawable.img1, "One", "ọkan", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.img2, "Two", "meji", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.img3, "Three", "mẹta", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.img4, "Four", "mẹrin", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.img5, "Five", "marun", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.img6, "Six", "mẹfa", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.img7, "Seven", "meje", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.img8, "Eight", "mẹjọ", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.img9, "Nine", "mẹsan", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.img10, "Ten", "mẹwa", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.img11, "Eleven", "mọkanla", soundIcon);
            ContentDetails detail12 = new ContentDetails(R.drawable.img12, "Twelve", "mejila", soundIcon);
            ContentDetails detail13 = new ContentDetails(R.drawable.img13, "Thirteen", "mẹtala", soundIcon);
            ContentDetails detail14 = new ContentDetails(R.drawable.img14, "Fourteen", "mẹrinla", soundIcon);
            ContentDetails detail15 = new ContentDetails(R.drawable.img15, "Fifteen", "mẹdogun", soundIcon);
            ContentDetails detail16 = new ContentDetails(R.drawable.img16, "Sixteen", "mẹrindilogun", soundIcon);
            ContentDetails detail17 = new ContentDetails(R.drawable.img17, "Seventeen", "mẹtadilogun", soundIcon);
            ContentDetails detail18 = new ContentDetails(R.drawable.img18, "Eighteen", "mejidilogun", soundIcon);
            ContentDetails detail19 = new ContentDetails(R.drawable.img19, "Nineteen", "nineteen", soundIcon);
            ContentDetails detail20 = new ContentDetails(R.drawable.img20, "Twenty", "ogún", soundIcon);
            ContentDetails detail21 = new ContentDetails(R.drawable.img21, "Twenty one", "ogún kan", soundIcon);
            ContentDetails detail22 = new ContentDetails(R.drawable.img22, "Twenty two", "meji-le-logun", soundIcon);
            ContentDetails detail23 = new ContentDetails(R.drawable.img23, "Twenty three", "mẹta-le-logun", soundIcon);
            ContentDetails detail24 = new ContentDetails(R.drawable.img24, " Twenty four", "mẹrin-le-logun", soundIcon);
            ContentDetails detail25 = new ContentDetails(R.drawable.img25, " Twenty five", "arundinlogbon", soundIcon);
            ContentDetails detail26 = new ContentDetails(R.drawable.img26, " Twenty six", "ogun mefa", soundIcon);
            ContentDetails detail27 = new ContentDetails(R.drawable.img27, " Twenty seven", "ogun meje", soundIcon);
            ContentDetails detail28 = new ContentDetails(R.drawable.img28, "Twenty eight", "ogun mẹjọ", soundIcon);
            ContentDetails detail29 = new ContentDetails(R.drawable.img29, "Twenty nine", "ogun mẹsan", soundIcon);
            ContentDetails detail30 = new ContentDetails(R.drawable.img30, "Thirty", "ọgbọn", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Yoruba.this, details));

        } else if (CourseWork.item == "ahbidi") {
            headerYoruba.setText(R.string.alphabet);
            ContentDetails detail1 = new ContentDetails(R.drawable.a, "A", "A a", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.b, "B", "B b", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.d, "D", "D d", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.e, "E", "E e", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.e, "E", "Ẹ", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.f, "F", "F f", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.g, "G", "G g", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.g, "G", "GB gb", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.h, "H", "H h", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.i, "I", "I i", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.j, "J", "J j", soundIcon);
            ContentDetails detail12 = new ContentDetails(R.drawable.k, "K", "K k", soundIcon);
            ContentDetails detail13 = new ContentDetails(R.drawable.letter_l, "L", "L l", soundIcon);
            ContentDetails detail14 = new ContentDetails(R.drawable.m, "M", "M m", soundIcon);
            ContentDetails detail15 = new ContentDetails(R.drawable.n, "N", "N n", soundIcon);
            ContentDetails detail16 = new ContentDetails(R.drawable.o, "O", "O o", soundIcon);
            ContentDetails detail17 = new ContentDetails(R.drawable.o, "O", "Ọ ọ", soundIcon);
            ContentDetails detail18 = new ContentDetails(R.drawable.o, "P", "P p", soundIcon);
            ContentDetails detail19 = new ContentDetails(R.drawable.r, "R", "R r", soundIcon);
            ContentDetails detail20 = new ContentDetails(R.drawable.s, "S", "S s", soundIcon);
            ContentDetails detail21 = new ContentDetails(R.drawable.s, "S", "Ṣ", soundIcon);
            ContentDetails detail22 = new ContentDetails(R.drawable.t, "T", "T t", soundIcon);
            ContentDetails detail23 = new ContentDetails(R.drawable.u, "U", "U u", soundIcon);
            ContentDetails detail24 = new ContentDetails(R.drawable.w, "W", "W w", soundIcon);
            ContentDetails detail25 = new ContentDetails(R.drawable.y, "Y", "Y y", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Yoruba.this, details));

        } else if (CourseWork.item == "unrẹrẹ") {
            headerYoruba.setText("Fruits");
            ContentDetails detail1 = new ContentDetails(R.drawable.apple, "Apple", "apu", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.banana, "Banana", "ogede", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.coconut, "Coconut", "agbon", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.garden_egg, "Garden egg", "ọgba ẹyin", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.mango, "Mango", "mango", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.orange, "Orange", "ọsan", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.pear, "Pear", "eso pia", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.water_melon, "Water melon", "Elegede", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.pineapple, "Pine apple", "ope", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.kola, "Kola nut", "kolanut", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.lemon, "Lemon", "lẹmọnu", soundIcon);
            ContentDetails detail12 = new ContentDetails(R.drawable.guava, "Guava", "Guava", soundIcon);
            ContentDetails detail13 = new ContentDetails(R.drawable.tangerine, "Tangerine", "ọsan oyinbo", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Yoruba.this, details));


    } else if (CourseWork.item == "ebi") {
            headerYoruba.setText(R.string.family);
            ContentDetails detail1 = new ContentDetails(R.drawable.husband_wife, "Husband", "ọkọ", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.husband_wife, "Wife", "iyawo", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.dad, "Father/Dad", "baba", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.mother, "Mother/Mum", "iya", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.grand_dad, "Grand Father", "sayin baba", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.grand_mum, "Grand Mother", "sayin iya", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.brother, "brother", "arakunrin", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.sister, "Sister", "arabinrin", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.big_bro, "Elder Brother", "Alàgbà arakunrin", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.big_sis, "Elder Sister", "Alàgbà arabinrin", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.family, "Siblings", "tegbotaburo", soundIcon);
            ContentDetails detail12 = new ContentDetails(R.drawable.uncle, "Uncle", "arakunrin", soundIcon);
            ContentDetails detail13 = new ContentDetails(R.drawable.aunt, "Aunt", "anti", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Yoruba.this, details));

        } else if (CourseWork.item == "awọ") {
            headerYoruba.setText(R.string.colours);
            ContentDetails detail1 = new ContentDetails(R.drawable.white, "White", "ọcha", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.black, "Black", "oji", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.blue, "Blue", "acha anụnụ anụnụ", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.orange, "Orange", "oroma", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.red, "Red", "Uhie", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.green, "Green", "Ndu Ndu", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.grey, "Grey", "Ucha nzu", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.purple, "Purple", "odo odo", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.yellow, "Yellow", "Edo", soundIcon);
            details.add(detail1);
            details.add(detail2);
            details.add(detail3);
            details.add(detail4);
            details.add(detail5);
            details.add(detail6);
            details.add(detail7);
            details.add(detail8);
            details.add(detail9);
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Yoruba.this, details));

        } else if (CourseWork.item == "eranko") {
            headerYoruba.setText(R.string.animals);
            ContentDetails detail1 = new ContentDetails(R.drawable.dog, "Dog", "aja", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.goat, "Goat", "ewurẹ", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.chicken, "Chicken", "adie", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.sheep, "Sheep", "agutan", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.cow, "Cow", "maalu", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.rabbit, "Rabbit", "ehoro", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.birds, "Birds", "eye", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.snake, "Snakes", "ejo", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.mosquito, "Mosquito", "efon", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.lion, "Lion", "kiniun", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.elephant, "Elephant", "erin", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Yoruba.this, details));

        } else if (CourseWork.item == "body apa") {
            headerYoruba.setText(R.string.body_parts);
            ContentDetails detail1 = new ContentDetails(R.drawable.head, "Head", "ori", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.eye, "Eye", "oju", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.nose, "Nose", "imu", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.mouth, "Mouth", "ẹnu", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.ear, "Ear", "etị", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.hand, "Hand", "ọwọ", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.leg, "Leg", "ẹsẹ", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.tongue, "Tongue", "ahọn", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.buttock, "Buttock", "buttock", soundIcon);
            details.add(detail1);
            details.add(detail2);
            details.add(detail3);
            details.add(detail4);
            details.add(detail5);
            details.add(detail6);
            details.add(detail7);
            details.add(detail8);
            details.add(detail9);
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Yoruba.this, details));

        } else if (CourseWork.item == "ikini") {
            headerYoruba.setText(R.string.greetings);
            ContentDetails detail1 = new ContentDetails("Welcome", "welcome", soundIcon);
            ContentDetails detail2 = new ContentDetails("Good Morning", "e kaaro", soundIcon);
            ContentDetails detail3 = new ContentDetails("Good Afternoon", "e kaasan", soundIcon);
            ContentDetails detail4 = new ContentDetails("Good Night", "Kasun layọ o", soundIcon);
            ContentDetails detail5 = new ContentDetails("Good day", "ojo dada", soundIcon);
            ContentDetails detail6 = new ContentDetails("Goodbye", "ti o dara", soundIcon);
            ContentDetails detail7 = new ContentDetails("Thank You", "o ṣeun", soundIcon);
            ContentDetails detail8 = new ContentDetails("Hello", "Pẹlẹ o", soundIcon);
            ContentDetails detail9 = new ContentDetails("How are you?", "Bawo ni o se wa?", soundIcon);
            detailsWithoutImgs.add(detail1);
            detailsWithoutImgs.add(detail2);
            detailsWithoutImgs.add(detail3);
            detailsWithoutImgs.add(detail4);
            detailsWithoutImgs.add(detail5);
            detailsWithoutImgs.add(detail6);
            detailsWithoutImgs.add(detail7);
            detailsWithoutImgs.add(detail8);
            detailsWithoutImgs.add(detail9);
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Yoruba.this, detailsWithoutImgs));

        } else if (CourseWork.item == "oge na ụbọchị") {
            headerYoruba.setText(R.string.time_date);
        } else if (CourseWork.item == "ojúṣe") {
            headerYoruba.setText(R.string.occupation);
            ContentDetails detail1 = new ContentDetails(R.drawable.engineer, "Engineer", "ẹlẹrọ", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.doctor, "Doctor", "dọkịta", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.programmer, "Programmer", "komputa", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.cook, "Cook", "cook", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.photographer, "Photographer", "fotogirafa", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.big_sis, "Secretary", "akọwé", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.student, "Student", "akeko", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.teacher, "Teacher", "olukọ", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.nurse, "Nurse", "nọọsi", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.lawyer, "Lawyer", "agbẹjọro", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.dentist, "Dentist", "ehin", soundIcon);
            ContentDetails detail12 = new ContentDetails(R.drawable.soldier, "Soldier", "jagunjagun", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Yoruba.this, details));

        } else if (CourseWork.item == "njẹ jade") {
            headerYoruba.setText(R.string.eating_out);
            ContentDetails detail1 = new ContentDetails("Breakfast", "aro", soundIcon);
            ContentDetails detail2 = new ContentDetails("Lunch", "ọsan", soundIcon);
            ContentDetails detail3 = new ContentDetails("Dinner/Supper", "ale", soundIcon);
            ContentDetails detail4 = new ContentDetails("Soup", "bimo ti", soundIcon);
            ContentDetails detail5 = new ContentDetails("Main dish", "main dish", soundIcon);
            ContentDetails detail6 = new ContentDetails("Dessert", "desaati", soundIcon);
            ContentDetails detail7 = new ContentDetails("Appetizer", "appetizer", soundIcon);
            ContentDetails detail8 = new ContentDetails("I am famished", "i n famished", soundIcon);
            ContentDetails detail9 = new ContentDetails("How much?", "elo ni?", soundIcon);
            ContentDetails detail10 = new ContentDetails("More, please", "diẹ jọwọ", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Yoruba.this, detailsWithoutImgs));

        } else if (CourseWork.item == "itọsọna ati ibi") {
            headerYoruba.setText(R.string.direction);;
        } else if (CourseWork.item == "rin") {
            headerYoruba.setText(R.string.travelling);
            ContentDetails detail1 = new ContentDetails("Bus", "bosi", soundIcon);
            ContentDetails detail2 = new ContentDetails("Taxi/Cab", "taxi", soundIcon);
            ContentDetails detail3 = new ContentDetails("Train", "reluwe", soundIcon);
            ContentDetails detail4 = new ContentDetails("Plane", "ofurufu", soundIcon);
            ContentDetails detail5 = new ContentDetails("Baggage", "eru", soundIcon);
            ContentDetails detail6 = new ContentDetails("Ticket", "tiketi", soundIcon);
            ContentDetails detail7 = new ContentDetails("Passport", "irina", soundIcon);
            ContentDetails detail8 = new ContentDetails("Airport", "papa", soundIcon);
            ContentDetails detail9 = new ContentDetails("Seat", "ijoko", soundIcon);
            ContentDetails detail10 = new ContentDetails("Entrance", "Ẹnu ọna", soundIcon);
            ContentDetails detail11 = new ContentDetails("Exit", "jade", soundIcon);
            ContentDetails detail12 = new ContentDetails("Boat/Ship", "ọkọ", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Yoruba.this, detailsWithoutImgs));

        } else if (CourseWork.item == "ohun tio wa") {
            headerYoruba.setText(R.string.shopping);
            ContentDetails detail1 = new ContentDetails("Money", "owo", soundIcon);
            ContentDetails detail2 = new ContentDetails("Credit card", "kaadị kirediti", soundIcon);
            ContentDetails detail4 = new ContentDetails("Groceries", "groceries", soundIcon);
            ContentDetails detail5 = new ContentDetails("Shopping center", "ohun tio wa aarin", soundIcon);
            ContentDetails detail6 = new ContentDetails("Super market", "super oja", soundIcon);
            ContentDetails detail7 = new ContentDetails("Pharmacy", "elegbogi", soundIcon);
            ContentDetails detail8 = new ContentDetails("Hat", "ijanilaya", soundIcon);
            ContentDetails detail9 = new ContentDetails("Shirt", "uwe elu", soundIcon);
            ContentDetails detail10 = new ContentDetails("Skirt", "shirt", soundIcon);
            ContentDetails detail11 = new ContentDetails("Shoes", "shoes", soundIcon);
            ContentDetails detail12 = new ContentDetails("Bags", "baagi", soundIcon);
            ContentDetails detail13 = new ContentDetails("Large size", "tobi iwọn", soundIcon);
            ContentDetails detail14 = new ContentDetails("Medium size", "alabọde iwọn", soundIcon);
            ContentDetails detail15 = new ContentDetails("Small size", "kekere iwọn", soundIcon);
            ContentDetails detail16 = new ContentDetails("Beautiful", "lẹwa", soundIcon);
            ContentDetails detail17 = new ContentDetails("I will take it", "i yoo gba o", soundIcon);
            ContentDetails detail18 = new ContentDetails("How much?", "elo ni?", soundIcon);
            detailsWithoutImgs.add(detail1);
            detailsWithoutImgs.add(detail2);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Yoruba.this, detailsWithoutImgs));

        } else {
            headerYoruba.setText(R.string.health);
            ContentDetails detail1 = new ContentDetails("Health", "ilera", soundIcon);
            ContentDetails detail2 = new ContentDetails("Drugs", "oloro", soundIcon);
            ContentDetails detail3 = new ContentDetails("Pharmacy", "elegbogi", soundIcon);
            ContentDetails detail4 = new ContentDetails("Blood", "ẹjẹ", soundIcon);
            ContentDetails detail5 = new ContentDetails("Disease", "arun", soundIcon);
            ContentDetails detail6 = new ContentDetails("Headache", "orififo", soundIcon);
            ContentDetails detail7 = new ContentDetails("Stomach-ache", "Ìyọnu ache", soundIcon);
            ContentDetails detail8 = new ContentDetails("Sick", "aisan", soundIcon);
            ContentDetails detail9 = new ContentDetails("I am sick", "mo ṣaarẹ", soundIcon);
            ContentDetails detail10 = new ContentDetails("Call am Doctor", "Pe dokita kan", soundIcon);
            ContentDetails detail11 = new ContentDetails("I need help", "Mo fe iranlowo", soundIcon);
            ContentDetails detail12 = new ContentDetails("I have an injury", "i ni ohun ipalara", soundIcon);
            ContentDetails detail13 = new ContentDetails("I am dying", "i n kú", soundIcon);
            ContentDetails detail14 = new ContentDetails("dead/death", "okú", soundIcon);
            ContentDetails detail15 = new ContentDetails("Medicine", "oogun", soundIcon);
            ContentDetails detail16 = new ContentDetails("Broken bones", "baje egungun", soundIcon);
            ContentDetails detail17 = new ContentDetails("Feeling better", "rilara dara", soundIcon);
            ContentDetails detail18 = new ContentDetails("Feeling worse", "rilara buru", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Yoruba.this, detailsWithoutImgs));


        }
    }
    }

