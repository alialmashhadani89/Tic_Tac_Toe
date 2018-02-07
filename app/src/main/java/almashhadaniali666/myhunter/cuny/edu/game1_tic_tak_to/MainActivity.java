package almashhadaniali666.myhunter.cuny.edu.game1_tic_tak_to;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button num1buttom = (Button) findViewById(R.id.Num1button);
        final Button num2buttom = (Button) findViewById(R.id.Num2button);
        final Button num3buttom = (Button) findViewById(R.id.Num3button);
        final Button num4buttom = (Button) findViewById(R.id.Num4button);
        final Button num5buttom = (Button) findViewById(R.id.Num5button);
        final Button num6buttom = (Button) findViewById(R.id.Num6button);
        final Button num7buttom = (Button) findViewById(R.id.Num7button);
        final Button num8buttom = (Button) findViewById(R.id.Num8button);
        final Button num9buttom = (Button) findViewById(R.id.Num9button);
        final TextView screen1 = (TextView) findViewById(R.id.ScreenTextView1);
        final TextView screen2 = (TextView) findViewById(R.id.ScreenTextView2);
        final TextView wincount1 = (TextView) findViewById(R.id.WincountTextView1);
        final TextView wincount2 = (TextView) findViewById(R.id.WinCounttextView2);
        final Button save = (Button) findViewById(R.id.SaveButton);
        final EditText nameEnter = (EditText) findViewById(R.id.NameTextEdit);
        final Button clearbutton = (Button) findViewById(R.id.ClearButton);
        final TextView move_count_view = (TextView) findViewById(R.id.Move_CountTextView);


        //////////////////////// variables class ///////////////////////
        class Global { // classes to make any variable I need.
            public int player = 1;


            public void change_color_player(){
                if (player == 1){
                    screen1.setTextColor(Color.parseColor("#006400"));
                    screen2.setTextColor(Color.BLACK);
                }
                else{
                    screen2.setTextColor(Color.parseColor("#006400"));
                    screen1.setTextColor(Color.BLACK);
                }
            }

            public void win_color(int win_s){ // color who won and lost.
                if (win_s == 1){
                    screen1.setTextColor(Color.parseColor("#006400"));
                    screen2.setTextColor(Color.RED);
                }
                else{
                    screen2.setTextColor(Color.parseColor("#006400"));
                    screen1.setTextColor(Color.RED);
                }
            }

        }

        final Global use = new Global();
        ///////////////////// end of the variables class  ////////////////

        //////////////////// Win count class ////////////////////////////
        class Wine { // to add the number to the count.
            public int wincount_1 = 0;
            public int wincount_2 = 0;
            public int move_count = 0;
            public int draw_count = 0;
            public void set_win1(){
                if (num1buttom.getText() == "X"){
                    wincount_1 = wincount_1 + 1;
                    wincount1.setText(""+wincount_1);
                }
                else{
                    wincount_2 = wincount_2 + 1;
                    wincount2.setText(""+wincount_2);
                }
            }
            public void set_win2(){
                if (num4buttom.getText() == "X"){
                    wincount_1 = wincount_1 + 1;
                    wincount1.setText(""+wincount_1);
                }
                else{
                    wincount_2 = wincount_2 + 1;
                    wincount2.setText(""+wincount_2);
                }
            }
            public void set_win3(){
                if (num7buttom.getText() == "X"){
                    wincount_1 = wincount_1 + 1;
                    wincount1.setText(""+wincount_1);
                }
                else{
                    wincount_2 = wincount_2 + 1;
                    wincount2.setText(""+wincount_2);
                }
            }
            public void set_win4(){
                if (num2buttom.getText() == "X"){
                    wincount_1 = wincount_1 + 1;
                    wincount1.setText(""+wincount_1);
                }
                else{
                    wincount_2 = wincount_2 + 1;
                    wincount2.setText(""+wincount_2);
                }
            }
            public void set_win5(){
                if (num3buttom.getText() == "X"){
                    wincount_1 = wincount_1 + 1;
                    wincount1.setText(""+wincount_1);
                }
                else{
                    wincount_2 = wincount_2 + 1;
                    wincount2.setText(""+wincount_2);
                }
            }


            public void stop_game(){ // to stop the game after the win.

                num1buttom.setEnabled(false); // disable
                num2buttom.setEnabled(false); // disable
                num3buttom.setEnabled(false); // disable
                num4buttom.setEnabled(false); // disable
                num5buttom.setEnabled(false); // disable
                num6buttom.setEnabled(false); // disable
                num7buttom.setEnabled(false); // disable
                num8buttom.setEnabled(false); // disable
                num9buttom.setEnabled(false); // disable

            }

            public void play_game(){
                num1buttom.setEnabled(true); // enable
                num2buttom.setEnabled(true); // enable
                num3buttom.setEnabled(true); // enable
                num4buttom.setEnabled(true); // enable
                num5buttom.setEnabled(true); // enable
                num6buttom.setEnabled(true); // enable
                num7buttom.setEnabled(true); // enable
                num8buttom.setEnabled(true); // enable
                num9buttom.setEnabled(true); // enable
            }

            public void clear_screen(){
                num1buttom.setText(""); // clear
                num2buttom.setText(""); // clear
                num3buttom.setText(""); // clear
                num4buttom.setText(""); // clear
                num5buttom.setText(""); // clear
                num6buttom.setText(""); // clear
                num7buttom.setText(""); // clear
                num8buttom.setText(""); // clear
                num9buttom.setText(""); // clear
            }
            public void clear_color(){
                num1buttom.setTextColor(Color.BLACK); // Change color to black.
                num2buttom.setTextColor(Color.BLACK); // Change color to black.
                num3buttom.setTextColor(Color.BLACK); // Change color to black.
                num4buttom.setTextColor(Color.BLACK); // Change color to black.
                num5buttom.setTextColor(Color.BLACK); // Change color to black.
                num6buttom.setTextColor(Color.BLACK); // Change color to black.
                num7buttom.setTextColor(Color.BLACK); // Change color to black.
                num8buttom.setTextColor(Color.BLACK); // Change color to black.
                num9buttom.setTextColor(Color.BLACK); // Change color to black.
            }
            public void move_view(){
                move_count_view.setText(""+move_count);
            }

            public void draw(){
                if(move_count == 9){
                    stop_game();
                }

            }
        }


        final Wine test = new Wine();

        //////////////////// End of win class //////////////////////

        ///////////////////// To check for the win /////////////////////////
        class Check{

            public void checkH1() {
                if ((num1buttom.getText() == "X" && num2buttom.getText() == "X" && num3buttom.getText() == "X") ||
                        (num1buttom.getText() == "O" && num2buttom.getText() == "O" && num3buttom.getText() == "O")) {
                    num1buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num2buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num3buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    test.set_win1(); // to count win.
                    test.stop_game(); // to stop the game.
                    if (use.player == 1) {
                        use.win_color(2);
                    } else {
                        use.win_color(1);
                    }
                }
            }

            public void checkH2(){
                if ((num4buttom.getText() == "X" && num5buttom.getText() == "X" && num6buttom.getText() == "X") ||
                        (num4buttom.getText() == "O" && num5buttom.getText() == "O" && num6buttom.getText() == "O")){
                    num4buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num5buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num6buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    test.set_win2(); // to count win.
                    test.stop_game(); // to stop the game.
                    if (use.player == 1) {
                        use.win_color(2);
                    } else {
                        use.win_color(1);
                    }

                }
            }

            public void CheckH3(){
                if ((num7buttom.getText() == "X" && num8buttom.getText() == "X" && num9buttom.getText() == "X")||
                        (num7buttom.getText() == "O" && num8buttom.getText() == "O" && num9buttom.getText() == "O")){
                    num7buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num8buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num9buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    test.set_win3(); // to count win.
                    test.stop_game(); // to stop the game.
                    if (use.player == 1) {
                        use.win_color(2);
                    } else {
                        use.win_color(1);
                    }

                }
            }

            public void CheckV1(){
                if ((num1buttom.getText() == "X" && num4buttom.getText() == "X" && num7buttom.getText() == "X")||
                        (num1buttom.getText() == "O" && num4buttom.getText() == "O" && num7buttom.getText() == "O")){
                    num1buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num4buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num7buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    test.set_win1(); // to count win.
                    test.stop_game(); // to stop the game.
                    if (use.player == 1) {
                        use.win_color(2);
                    } else {
                        use.win_color(1);
                    }

                }
            }

            public void CheckV2(){
                if ((num2buttom.getText() == "X" && num5buttom.getText() == "X" && num8buttom.getText() == "X")||
                        (num2buttom.getText() == "O" && num5buttom.getText() == "O" && num8buttom.getText() == "O")){
                    num2buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num5buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num8buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    test.set_win4(); // to count win.
                    test.stop_game(); // to stop the game.
                    if (use.player == 1) {
                        use.win_color(2);
                    } else {
                        use.win_color(1);
                    }

                }
            }

            public void CheckV3(){
                if ((num3buttom.getText() == "X" && num6buttom.getText() == "X" && num9buttom.getText() == "X")||
                        (num3buttom.getText() == "O" && num6buttom.getText() == "O" && num9buttom.getText() == "O")){
                    num3buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num6buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num9buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    test.set_win5(); // to count win.
                    test.stop_game(); // to stop the game.
                    if (use.player == 1) {
                        use.win_color(2);
                    } else {
                        use.win_color(1);
                    }

                }
            }

            public void CheckX1(){
                if ((num1buttom.getText() == "X" && num5buttom.getText() == "X" && num9buttom.getText() == "X")||
                        (num1buttom.getText() == "O" && num5buttom.getText() == "O" && num9buttom.getText() == "O")){
                    num1buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num5buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num9buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    test.set_win1(); // to count win.
                    test.stop_game(); // to stop the game.
                    if (use.player == 1) {
                        use.win_color(2);
                    } else {
                        use.win_color(1);
                    }

                }
            }

            public void CheckX2(){
                if ((num3buttom.getText() == "X" && num5buttom.getText() == "X" && num7buttom.getText() == "X")||
                        (num3buttom.getText() == "O" && num5buttom.getText() == "O" && num7buttom.getText() == "O")){
                    num3buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num5buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    num7buttom.setTextColor(Color.parseColor("#006400")); // green color.
                    test.set_win5(); // to count win.
                    test.stop_game(); // to stop the game.
                    if (use.player == 1) {
                        use.win_color(2);
                    } else {
                        use.win_color(1);
                    }

                }
            }
        }
        final Check win = new Check();

        ///////////////////// End check win /////////////////////////////

        num1buttom.setOnClickListener(new View.OnClickListener() { // button 1
            @Override
            public void onClick(View view) {
                if (num1buttom.getText().toString().equals("")) { // to check if the button is empty.

                    if (use.player == 1) {
                        num1buttom.setText("X"); // make the text go bigger.
                        use.player = 2;
                        test.move_count = test.move_count +1; // track moves.
                    } else {
                        num1buttom.setText("O");
                        use.player = 1;
                        test.move_count = test.move_count +1; // track moves.
                    }
                }
                else{
                    num1buttom.setTextColor(Color.RED); // color red when the button is full.

                    Handler handler = new Handler(); // this will daily the action.
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            // Actions to do after 5 seconds
                            num1buttom.setTextColor(Color.BLACK);
                        }
                    }, 1000);


                    Context context = getApplicationContext();
                    CharSequence text = "square is taken!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }
                num1buttom.setTextSize(50); // to make the text size on the button bigger.
                use.change_color_player(); // to change the color of player in screen.
                win.checkH1(); // check for win.
                win.CheckV1(); // check for win.
                win.CheckX1(); // check foe win.
                test.move_view();
                test.draw(); // check for draw.



            }
        });

        num2buttom.setOnClickListener(new View.OnClickListener() { // button 2
            @Override
            public void onClick(View view) {
               if (num2buttom.getText().toString().equals("")) { // to check of the button is empty.
                   if (use.player == 1) {
                       num2buttom.setText("X"); // make the text go bigger.
                       use.player = 2;
                       test.move_count = test.move_count +1; // track moves.
                   } else {
                       num2buttom.setText("O");
                       use.player = 1;
                       test.move_count = test.move_count +1; // track moves.
                   }
               }
               else {
                   num2buttom.setTextColor(Color.RED); // color red when the button is full.

                   Handler handler = new Handler();
                   handler.postDelayed(new Runnable() {
                       public void run() {
                           // Actions to do after 5 seconds
                           num2buttom.setTextColor(Color.BLACK);
                       }
                   }, 1000);


                   Context context = getApplicationContext();
                   CharSequence text = "square is taken!";
                   int duration = Toast.LENGTH_SHORT;
                   Toast toast = Toast.makeText(context, text, duration);
                   toast.show();
               }
                num2buttom.setTextSize(50); // to make the text size on the button bigger.
                use.change_color_player(); // to change the color of player in screen.
                win.checkH1();
                win.CheckV2();
                test.move_view();
                test.draw(); // check for draw.

            }
        });

        num3buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num3buttom.getText().toString().equals("")) { // to check if the button is empty.

                    if (use.player == 1) {
                        num3buttom.setText("X"); // make the text go bigger.
                        use.player = 2;
                        test.move_count = test.move_count +1; // track moves.
                    } else {
                        num3buttom.setText("O");
                        use.player = 1;
                        test.move_count = test.move_count +1; // track moves.
                    }
                }
                else{
                    num3buttom.setTextColor(Color.RED); // color red when the button full.

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            // Actions to do after 5 seconds
                            num3buttom.setTextColor(Color.BLACK);
                        }
                    }, 1000);


                    Context context = getApplicationContext();
                    CharSequence text = "square is taken!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                num3buttom.setTextSize(50); // to make the text size on the button bigger.
                use.change_color_player(); // to change the color of player in screen.
                win.checkH1(); // check for win.
                win.CheckV3(); // check for win.
                win.CheckX2(); // check for win.
                test.move_view();
                test.draw(); // check for draw.

            }
        });

        num4buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num4buttom.getText().toString().equals("")) { // to check if the button is empty.

                    if (use.player == 1) {
                        num4buttom.setText("X"); // make the text go bigger.
                        use.player = 2;
                        test.move_count = test.move_count +1; // track moves.
                    } else {
                        num4buttom.setText("O");
                        use.player = 1;
                        test.move_count = test.move_count +1; // track moves.
                    }
                }
                else{
                    num4buttom.setTextColor(Color.RED); // color red when the button is full.

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            // Actions to do after 5 seconds
                            num4buttom.setTextColor(Color.BLACK);
                        }
                    }, 1000);

                    Context context = getApplicationContext();
                    CharSequence text = "square is taken!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                num4buttom.setTextSize(50); // to make the text size on the button bigger.

                use.change_color_player(); // to change the color of player in screen.
                win.checkH2(); // check for win.
                win.CheckV1(); // check for win.
                test.move_view();
                test.draw(); // check for draw.

            }
        });

        num5buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num5buttom.getText().toString().equals("")) { // to check if the button is empty.

                    if (use.player == 1) {
                        num5buttom.setText("X"); // make the text go bigger.
                        use.player = 2;
                        test.move_count = test.move_count +1; // track moves.
                    } else {
                        num5buttom.setText("O");
                        use.player = 1;
                        test.move_count = test.move_count +1; // track moves.
                    }
                }
                else{
                    num5buttom.setTextColor(Color.RED); // color red when the button is full.

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            // Actions to do after 5 seconds
                            num5buttom.setTextColor(Color.BLACK);
                        }
                    }, 1000);

                    Context context = getApplicationContext();
                    CharSequence text = "square is taken!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                num5buttom.setTextSize(50); // to make the text size on the button bigger.
                use.change_color_player(); // to change the color of player in screen.
                win.checkH2(); // check for win.
                win.CheckV2(); // check for win.
                win.CheckX1(); // check for win.
                win.CheckX2(); // check foe win.
                test.move_view();
                test.draw(); // check for draw.

            }
        });

        num6buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num6buttom.getText().toString().equals("")) { // to check if the button is empty.

                    if (use.player == 1) {
                        num6buttom.setText("X"); // make the text go bigger.
                        use.player = 2;
                        test.move_count = test.move_count +1; // track moves.
                    } else {
                        num6buttom.setText("O");
                        use.player = 1;
                        test.move_count = test.move_count +1; // track moves.
                    }
                }
                else{
                    num6buttom.setTextColor(Color.RED); // color red when the button is full.

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            // Actions to do after 5 seconds
                            num6buttom.setTextColor(Color.BLACK);
                        }
                    }, 1000);

                    Context context = getApplicationContext();
                    CharSequence text = "square is taken!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                num6buttom.setTextSize(50); // to make the text size on the button bigger.
                use.change_color_player(); // to change the color of player in screen.
                win.checkH2(); // check for win.
                win.CheckV3(); // check for win.
                test.move_view();
                test.draw(); // check for draw.

            }
        });

        num7buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num7buttom.getText().toString().equals("")) { // to check if the button is empty.

                    if (use.player == 1) {
                        num7buttom.setText("X"); // make the text go bigger.
                        use.player = 2;
                        test.move_count = test.move_count +1; // track moves.
                    } else {
                        num7buttom.setText("O");
                        use.player = 1;
                        test.move_count = test.move_count +1; // track moves.
                    }
                }
                else{
                    num7buttom.setTextColor(Color.RED); // color red when the button full.

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            // Actions to do after 5 seconds
                            num7buttom.setTextColor(Color.BLACK);
                        }
                    }, 1000);

                    Context context = getApplicationContext();
                    CharSequence text = "square is taken!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                num7buttom.setTextSize(50); // to make the text size on the button bigger.
                use.change_color_player(); // to change the color of player in screen.
                win.CheckH3(); // cheek for win.
                win.CheckV1(); // Check for win.
                win.CheckX2(); // check for win.
                test.move_view();
                test.draw(); // check for draw.

            }
        });

        num8buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num8buttom.getText().toString().equals("")) { // to check if the button is empty.

                    if (use.player == 1) {
                        num8buttom.setText("X"); // make the text go bigger.
                        use.player = 2;
                        test.move_count = test.move_count +1; // track moves.
                    } else {
                        num8buttom.setText("O");
                        use.player = 1;
                        test.move_count = test.move_count +1; // track moves.
                    }
                } else {
                    num8buttom.setTextColor(Color.RED); // color red when the button full.

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            // Actions to do after 5 seconds
                            num8buttom.setTextColor(Color.BLACK);
                        }
                    }, 1000);

                    Context context = getApplicationContext();
                    CharSequence text = "square is taken!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                num8buttom.setTextSize(50); // to make the text size on the button bigger.
                use.change_color_player(); // to change the color of player in screen.
                win.CheckH3(); // check for win
                win.CheckV2(); // check for win
                test.move_view();
                test.draw(); // check for draw.

            }
        });

        num9buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num9buttom.getText().toString().equals("")) { // to check if the button is empty.

                    if (use.player == 1) {
                        num9buttom.setText("X"); // make the text go bigger.
                        use.player = 2;
                        test.move_count = test.move_count +1; // track moves.
                    } else {
                        num9buttom.setText("O");
                        use.player = 1;
                        test.move_count = test.move_count +1; // track moves.
                    }
                }
                else{
                    num9buttom.setTextColor(Color.RED); // color red when the button full.

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            // Actions to do after 5 seconds
                            num9buttom.setTextColor(Color.BLACK);
                        }
                    }, 1000);

                    Context context = getApplicationContext();
                    CharSequence text = "square is taken!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                num9buttom.setTextSize(50); // to make the text size on the button bigger.
                use.change_color_player(); // to change the color of player in screen.
                win.CheckH3(); // check for win.
                win.CheckV3(); // check for win.
                win.CheckX1(); // check for win.
                test.move_view();
                test.draw(); // check for draw.

            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen1.getText().toString().equals("")) {
                    screen1.setText("Player 1" +"\n"+nameEnter.getText()+" (X)");
                    nameEnter.setText(" ");
                    nameEnter.setHint("Enter your name");
                }
                else {
                    screen2.setText("Player 2" +"\n"+nameEnter.getText()+" (O)");
                    nameEnter.setText(" ");
                    nameEnter.setHint("Enjoy playing");
                    screen1.setTextColor(Color.parseColor("#006400"));
                    save.setEnabled(false);

                }
            }
        });

        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test.play_game(); // to make the buttons actives
                test.clear_screen(); // to clear the screen.
                test.clear_color();
                use.player = 1; // to set player to player 1.
                use.change_color_player(); // to change the color of player in screen.
                test.move_count = 0;
                test.move_view();


            }
        });


    }
}

