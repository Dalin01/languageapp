package com.example.darlington.igbohausayoruba;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Hausa extends AppCompatActivity {

    ListView detailsList;
    ArrayList<ContentDetails> details;
    int soundIcon = R.drawable.sound_icon;
    ArrayList<ContentDetails> detailsWithoutImgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hausa);
        detailsList = (ListView) findViewById(R.id.hausaList);
        TextView headerHausa = (TextView) findViewById(R.id.text_view_hausa);
        details = new ArrayList<ContentDetails>();
        detailsWithoutImgs = new ArrayList<ContentDetails>();

        if (CourseWork.item == "lambar") {
            headerHausa.setText(R.string.number);
            ContentDetails detail0 = new ContentDetails(R.drawable.img0, "Zero", "Sifili", soundIcon);
            ContentDetails detail1 = new ContentDetails(R.drawable.img1, "One", "Daya", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.img2, "Two", "Biyu", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.img3, "Three", "Uku", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.img4, "Four", "Hudu", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.img5, "Five", "Biyar", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.img6, "Six", "Shida", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.img7, "Seven", "Bakwai", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.img8, "Eight", "Takwas", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.img9, "Nine", "Tara", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.img10, "Ten", "Goma", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.img11, "Eleven", "Goma sha", soundIcon);
            ContentDetails detail12 = new ContentDetails(R.drawable.img12, "Twelve", "Goma sha biyu", soundIcon);
            ContentDetails detail13 = new ContentDetails(R.drawable.img13, "Thirteen", "Goma sha uku", soundIcon);
            ContentDetails detail14 = new ContentDetails(R.drawable.img14, "Fourteen", "Goma sha hudu", soundIcon);
            ContentDetails detail15 = new ContentDetails(R.drawable.img15, "Fifteen", "Goma sha biyar", soundIcon);
            ContentDetails detail16 = new ContentDetails(R.drawable.img16, "Sixteen", "Goma sha shida", soundIcon);
            ContentDetails detail17 = new ContentDetails(R.drawable.img17, "Seventeen", "Goma sha bakwai", soundIcon);
            ContentDetails detail18 = new ContentDetails(R.drawable.img18, "Eighteen", "Goma sha takwas", soundIcon);
            ContentDetails detail19 = new ContentDetails(R.drawable.img19, "Nineteen", "Goma sha tara", soundIcon);
            ContentDetails detail20 = new ContentDetails(R.drawable.img20, "Twenty", "Ashirin", soundIcon);
            ContentDetails detail21 = new ContentDetails(R.drawable.img21, "Twenty one", "Ashirin da daya", soundIcon);
            ContentDetails detail22 = new ContentDetails(R.drawable.img22, "Twenty two", "Ashirin da biyu", soundIcon);
            ContentDetails detail23 = new ContentDetails(R.drawable.img23, "Twenty three", "Ashirin da uku", soundIcon);
            ContentDetails detail24 = new ContentDetails(R.drawable.img24, " Twenty four", "Ashirin da hudu", soundIcon);
            ContentDetails detail25 = new ContentDetails(R.drawable.img25, " Twenty five", "Ashirin da biyar", soundIcon);
            ContentDetails detail26 = new ContentDetails(R.drawable.img26, " Twenty six", "Ashirin da shida", soundIcon);
            ContentDetails detail27 = new ContentDetails(R.drawable.img27, " Twenty seven", "Ashirin da bakwai", soundIcon);
            ContentDetails detail28 = new ContentDetails(R.drawable.img28, "Twenty eight", "Ashirin da takwas", soundIcon);
            ContentDetails detail29 = new ContentDetails(R.drawable.img29, "Twenty nine", "Ashirin da tara", soundIcon);
            ContentDetails detail30 = new ContentDetails(R.drawable.img30, "Thirty", "Talatin", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Hausa.this, details));

        } else if (CourseWork.item == "haruffa") {
            headerHausa.setText(R.string.alphabet);
            ContentDetails detail1 = new ContentDetails(R.drawable.a, "A", "A a", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.b, "B", "B b", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.b, "B", "Ɓ ɓ", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.c, "C", "C c", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.d, "D", "D d", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.d, "D", "Ɗ ɗ", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.e, "E", "E e", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.f, "F", "F f", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.g, "G", "G g", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.h, "H", "H h", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.i, "I", "I i", soundIcon);
            ContentDetails detail12 = new ContentDetails(R.drawable.j, "J", "J j", soundIcon);
            ContentDetails detail13 = new ContentDetails(R.drawable.k, "K", "K k", soundIcon);
            ContentDetails detail14 = new ContentDetails(R.drawable.k, "K", "Ƙ ƙ", soundIcon);
            ContentDetails detail15 = new ContentDetails(R.drawable.letter_l, "L", "L l", soundIcon);
            ContentDetails detail16 = new ContentDetails(R.drawable.m, "M", "M m", soundIcon);
            ContentDetails detail17 = new ContentDetails(R.drawable.n, "N", "N n", soundIcon);
            ContentDetails detail18 = new ContentDetails(R.drawable.o, "O", "O o", soundIcon);
            ContentDetails detail19 = new ContentDetails(R.drawable.r, "R", "R r", soundIcon);
            ContentDetails detail20 = new ContentDetails(R.drawable.r, "R", "R 'r", soundIcon);
            ContentDetails detail21 = new ContentDetails(R.drawable.s, "S", "S s", soundIcon);
            ContentDetails detail22 = new ContentDetails(R.drawable.s, "S", "SH sh", soundIcon);
            ContentDetails detail23 = new ContentDetails(R.drawable.t, "T", "T t", soundIcon);
            ContentDetails detail24 = new ContentDetails(R.drawable.t, "T", "Ts ts", soundIcon);
            ContentDetails detail25 = new ContentDetails(R.drawable.u, "U", "U u", soundIcon);
            ContentDetails detail26 = new ContentDetails(R.drawable.w, "W", "W w", soundIcon);
            ContentDetails detail27 = new ContentDetails(R.drawable.w, "Y", "Y y", soundIcon);
            ContentDetails detail28 = new ContentDetails(R.drawable.w, "Y", "Ƴ ƴ", soundIcon);
            ContentDetails detail29 = new ContentDetails(R.drawable.y, "Y", "Z z", soundIcon);
            ContentDetails detail30 = new ContentDetails(R.drawable.z, "", "'", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Hausa.this, details));

        } else if (CourseWork.item == "'Ya'yan itãcen marmari") {
            headerHausa.setText("Fruits");
            ContentDetails detail1 = new ContentDetails(R.drawable.apple, "Apple", "apple", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.banana, "Banana", "ayaba", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.coconut, "Coconut", "kwakwa", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.garden_egg, "Garden egg", "lambu kwai", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.mango, "Mango", "mangoro", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.orange, "Orange", "orange", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.pear, "Pear", "pear", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.water_melon, "Water melon", "kankana", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.pineapple, "Pine apple", "pine nema", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.kola, "Kola nut", "kola goro", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.lemon, "Lemon", "lemun tsami", soundIcon);
            ContentDetails detail12 = new ContentDetails(R.drawable.guava, "Guava", "Guava", soundIcon);
            ContentDetails detail13 = new ContentDetails(R.drawable.tangerine, "Tangerine", "tanjarin", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Hausa.this, details));

        } else if (CourseWork.item == "iyali") {
            headerHausa.setText(R.string.family);
            ContentDetails detail1 = new ContentDetails(R.drawable.husband_wife, "Husband", "miji", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.husband_wife, "Wife", "matar", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.dad, "Father/Dad", "uba", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.mother, "Mother/Mum", "uwar", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.grand_dad, "Grand Father", "grand uba", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.grand_mum, "Grand Mother", "grand uwar", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.brother, "brother", "wa", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.sister, "Sister", "'yar'uwar", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.big_bro, "Elder Brother", "yayana", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.big_sis, "Elder Sister", "m 'yar'uwar", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.family, "Siblings", "siblings", soundIcon);
            ContentDetails detail12 = new ContentDetails(R.drawable.uncle, "Uncle", "kawun", soundIcon);
            ContentDetails detail13 = new ContentDetails(R.drawable.aunt, "Aunt", "inna", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Hausa.this, details));

        } else if (CourseWork.item == "launi") {
            headerHausa.setText(R.string.colours);
            ContentDetails detail1 = new ContentDetails(R.drawable.white, "White", "fari", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.black, "Black", "baki", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.blue, "Blue", "blue", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.orange, "Orange", "orange", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.red, "Red", "ja", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.green, "Green", "kore", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.grey, "Grey", "m", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.purple, "Purple", "shunayya", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.yellow, "Yellow", "rawaya", soundIcon);
            details.add(detail1);
            details.add(detail2);
            details.add(detail3);
            details.add(detail4);
            details.add(detail5);
            details.add(detail6);
            details.add(detail7);
            details.add(detail8);
            details.add(detail9);
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Hausa.this, details));

        } else if (CourseWork.item == "dabba") {
            headerHausa.setText(R.string.animals);
            ContentDetails detail1 = new ContentDetails(R.drawable.dog, "Dog", "kare", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.goat, "Goat", "goat", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.chicken, "Chicken", "kaza", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.sheep, "Sheep", "tumaki", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.cow, "Cow", "saniya", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.rabbit, "Rabbit", "zomo", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.birds, "Birds", "tsuntsãye", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.snake, "Snakes", "macizai", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.mosquito, "Mosquito", "sauro", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.lion, "Lion", "zaki", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.elephant, "Elephant", "elephate", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Hausa.this, details));

        } else if (CourseWork.item == "jiki sashi") {
            headerHausa.setText(R.string.body_parts);
            ContentDetails detail1 = new ContentDetails(R.drawable.head, "Head", "shugaban", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.eye, "Eye", "ido", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.nose, "Nose", "nanci", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.mouth, "Mouth", "bakinka", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.ear, "Ear", "kunne", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.hand, "Hand", "hannu", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.leg, "Leg", "kafa", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.tongue, "Tongue", "harshe", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Hausa.this, details));

        } else if (CourseWork.item == "gaisuwa") {
            headerHausa.setText(R.string.greetings);
            ContentDetails detail1 = new ContentDetails("Welcome", "barka", soundIcon);
            ContentDetails detail2 = new ContentDetails("Good Morning", "mai kyau safe", soundIcon);
            ContentDetails detail3 = new ContentDetails("Good Afternoon", "barka da rana", soundIcon);
            ContentDetails detail4 = new ContentDetails("Good Night", "mai kyau dare", soundIcon);
            ContentDetails detail5 = new ContentDetails("Good day", "ina kwana", soundIcon);
            ContentDetails detail6 = new ContentDetails("Goodbye", "sai wata rana", soundIcon);
            ContentDetails detail7 = new ContentDetails("Thank You", "na gode", soundIcon);
            ContentDetails detail8 = new ContentDetails("Hello", "sannu", soundIcon);
            ContentDetails detail9 = new ContentDetails("How are you?", "yaya dai?", soundIcon);
            detailsWithoutImgs.add(detail1);
            detailsWithoutImgs.add(detail2);
            detailsWithoutImgs.add(detail3);
            detailsWithoutImgs.add(detail4);
            detailsWithoutImgs.add(detail5);
            detailsWithoutImgs.add(detail6);
            detailsWithoutImgs.add(detail7);
            detailsWithoutImgs.add(detail8);
            detailsWithoutImgs.add(detail9);
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Hausa.this, detailsWithoutImgs));

        } else if (CourseWork.item == "lokaci da kwanan wata") {
            headerHausa.setText(R.string.time_date);
        } else if (CourseWork.item == "zama") {
            headerHausa.setText(R.string.occupation);
            ContentDetails detail1 = new ContentDetails(R.drawable.engineer, "Engineer", "injiniyoyin", soundIcon);
            ContentDetails detail2 = new ContentDetails(R.drawable.doctor, "Doctor", "likita", soundIcon);
            ContentDetails detail3 = new ContentDetails(R.drawable.programmer, "Programmer", "shirye-shiryen", soundIcon);
            ContentDetails detail4 = new ContentDetails(R.drawable.cook, "Cook", "cook", soundIcon);
            ContentDetails detail5 = new ContentDetails(R.drawable.photographer, "Photographer", "daukar hoto", soundIcon);
            ContentDetails detail6 = new ContentDetails(R.drawable.big_sis, "Secretary", "sakataren", soundIcon);
            ContentDetails detail7 = new ContentDetails(R.drawable.student, "Student", "dalibi", soundIcon);
            ContentDetails detail8 = new ContentDetails(R.drawable.teacher, "Teacher", "malami", soundIcon);
            ContentDetails detail9 = new ContentDetails(R.drawable.nurse, "Nurse", "nas", soundIcon);
            ContentDetails detail10 = new ContentDetails(R.drawable.lawyer, "Lawyer", "lauya", soundIcon);
            ContentDetails detail11 = new ContentDetails(R.drawable.dentist, "Dentist", "likitan hakori", soundIcon);
            ContentDetails detail12 = new ContentDetails(R.drawable.soldier, "Soldier", "soja", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapter(Hausa.this, details));

        } else if (CourseWork.item == "cin abinci a waje") {
            headerHausa.setText(R.string.eating_out);
            ContentDetails detail1 = new ContentDetails("Breakfast", "karin kumallo", soundIcon);
            ContentDetails detail2 = new ContentDetails("Lunch", "abincin rana", soundIcon);
            ContentDetails detail3 = new ContentDetails("Dinner/Supper", "abincin dare", soundIcon);
            ContentDetails detail4 = new ContentDetails("Soup", "miya", soundIcon);
            ContentDetails detail5 = new ContentDetails("Main dish", "babban tasa", soundIcon);
            ContentDetails detail6 = new ContentDetails("Dessert", "kayan zaki", soundIcon);
            ContentDetails detail7 = new ContentDetails("Appetizer", "appetizer", soundIcon);
            ContentDetails detail8 = new ContentDetails("I am famished", "ina jin yunwa", soundIcon);
            ContentDetails detail9 = new ContentDetails("How much?", "nawa?", soundIcon);
            ContentDetails detail10 = new ContentDetails("More, please", "mafi don Allah", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Hausa.this, detailsWithoutImgs));

        } else if (CourseWork.item == "shugabanci da kuma wuraren") {
            headerHausa.setText(R.string.direction);
        } else if (CourseWork.item == "tafiya") {
            headerHausa.setText(R.string.travelling);
            ContentDetails detail1 = new ContentDetails("Bus", "bas", soundIcon);
            ContentDetails detail2 = new ContentDetails("Taxi/Cab", "taxi", soundIcon);
            ContentDetails detail3 = new ContentDetails("Train", "jirgin kasa", soundIcon);
            ContentDetails detail4 = new ContentDetails("Plane", "jirgin sama", soundIcon);
            ContentDetails detail5 = new ContentDetails("Baggage", "kaya", soundIcon);
            ContentDetails detail6 = new ContentDetails("Ticket", "tikitin", soundIcon);
            ContentDetails detail7 = new ContentDetails("Passport", "fasfo", soundIcon);
            ContentDetails detail8 = new ContentDetails("Airport", "filin jirgin sama", soundIcon);
            ContentDetails detail9 = new ContentDetails("Seat", "wurin zama", soundIcon);
            ContentDetails detail10 = new ContentDetails("Entrance", "ƙofar", soundIcon);
            ContentDetails detail11 = new ContentDetails("Exit", "fita", soundIcon);
            ContentDetails detail12 = new ContentDetails("Boat/Ship", "jirgin ruwan", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Hausa.this, detailsWithoutImgs));

        } else if (CourseWork.item == "Shopping") {
            headerHausa.setText(R.string.shopping);
            ContentDetails detail1 = new ContentDetails("Money", "kudi", soundIcon);
            ContentDetails detail2 = new ContentDetails("Credit card", "katin bashi", soundIcon);
            ContentDetails detail3 = new ContentDetails("Clothes", "clothes", soundIcon);
            ContentDetails detail4 = new ContentDetails("Groceries", "sayar da kayayyakin lambu", soundIcon);
            ContentDetails detail5 = new ContentDetails("Shopping center", "shopping cibiyar", soundIcon);
            ContentDetails detail6 = new ContentDetails("Super market", "babban kanti", soundIcon);
            ContentDetails detail7 = new ContentDetails("Pharmacy", "kantin", soundIcon);
            ContentDetails detail8 = new ContentDetails("Hat", "hat", soundIcon);
            ContentDetails detail9 = new ContentDetails("Shirt", "shirt", soundIcon);
            ContentDetails detail10 = new ContentDetails("Skirt", "skirt", soundIcon);
            ContentDetails detail11 = new ContentDetails("Shoes", "takalma", soundIcon);
            ContentDetails detail12 = new ContentDetails("Bags", "jakar", soundIcon);
            ContentDetails detail13 = new ContentDetails("Large size", "manyan size", soundIcon);
            ContentDetails detail14 = new ContentDetails("Medium size", "matsakaici size", soundIcon);
            ContentDetails detail15 = new ContentDetails("Small size", "kananan size", soundIcon);
            ContentDetails detail16 = new ContentDetails("Beautiful", "kyua", soundIcon);
            ContentDetails detail17 = new ContentDetails("I will take it", "i zai dauki shi", soundIcon);
            ContentDetails detail18 = new ContentDetails("How much?", "nawa", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Hausa.this, detailsWithoutImgs));

        } else {
            headerHausa.setText(R.string.health);
            ContentDetails detail1 = new ContentDetails("Health", "kiwon lafiya", soundIcon);
            ContentDetails detail2 = new ContentDetails("Drugs", "kwayoyi", soundIcon);
            ContentDetails detail3 = new ContentDetails("Pharmacy", "kantin", soundIcon);
            ContentDetails detail4 = new ContentDetails("Blood", "jini", soundIcon);
            ContentDetails detail5 = new ContentDetails("Disease", "cuta", soundIcon);
            ContentDetails detail6 = new ContentDetails("Headache", "ciwon kai", soundIcon);
            ContentDetails detail7 = new ContentDetails("Stomach-ache", "ciwon citi", soundIcon);
            ContentDetails detail8 = new ContentDetails("Sick", "rashin lafiya", soundIcon);
            ContentDetails detail9 = new ContentDetails("I am sick", "ba ni da lafiya", soundIcon);
            ContentDetails detail10 = new ContentDetails("Call am Doctor", "kira wani likita", soundIcon);
            ContentDetails detail11 = new ContentDetails("I need help", "ina bukatan taimako", soundIcon);
            ContentDetails detail12 = new ContentDetails("I have an injury", "i da wani rauni", soundIcon);
            ContentDetails detail13 = new ContentDetails("I am dying", "ina mutuwa", soundIcon);
            ContentDetails detail14 = new ContentDetails("dead/death", "matattu", soundIcon);
            ContentDetails detail15 = new ContentDetails("Medicine", "magani", soundIcon);
            ContentDetails detail16 = new ContentDetails("Broken bones", "Broken Kasusuwa", soundIcon);
            ContentDetails detail17 = new ContentDetails("Feeling better", "feeling better", soundIcon);
            ContentDetails detail18 = new ContentDetails("Feeling worse", "ji m", soundIcon);
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
            detailsList.setAdapter(new CourseDetailsCustomAdapterWithoutImg(Hausa.this, detailsWithoutImgs));


        }
    }
    }

