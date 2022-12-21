package com.n.myapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    char[] arr = new char[9];
    boolean what;
    char X = 'X';
    char O = 'O';


private void setWhat(){
    what = !what;
}
int setin(int a) {
    int b = 0;

    if (what) {
        arr[a] = O;
     b = 1;
    }
    if (!what) {
        arr[a] = X;
      b = 2;
    }
          //  }
    return b;
}

@Override
    public void onClick(View v) {

    setWhat();

    final TextView dtext = findViewById(R.id.textView);
    Button b4 = findViewById(R.id.button4);
    Button b3 = findViewById(R.id.button3);
    Button b5 = findViewById(R.id.button5);
    Button b6 = findViewById(R.id.button6);
    Button b7 = findViewById(R.id.button7);
    Button b8 = findViewById(R.id.button8);
    Button b = findViewById(R.id.button);
    Button b2 = findViewById(R.id.button2);
    Button b9 = findViewById(R.id.button9);
    Button otext = findViewById(R.id.dummy_button);



     v.setEnabled(false);

    String xx = "O turn";
    String oo = "X turn";

    if (what)
        dtext.setText(oo);
    if (!what)
        dtext.setText(xx);
    switch (v.getId()) {

            case R.id.button4:

   if( setin(1)==1)
        b4.setText("O") ; else b4.setText("X");
win();
                break;

            case R.id.button3:

    if(setin(0)==1)
        b3.setText("O");
                else b3.setText("X");
win();
                break;

            case R.id.button5:

                if(setin(2)==1)
                    b5.setText("O");
                else b5.setText("X");
win();
                break;
            case R.id.button6:

                if(setin(3)==1)
                    b6.setText("O");
                else b6.setText("X");
win();
                break;
            case R.id.button7:

                if(setin(4)==1)
                    b7.setText("O");
                else b7.setText("X");
win();
                break;

            case R.id.button8:

                if(setin(5)==1)
                    b8.setText("O");
                else b8.setText("X");
win();
                break;
            case R.id.button:

                if(setin(6)==1)
                    b.setText("O");
                else b.setText("X");
win();
                break;

            case R.id.button2:

                if(setin(7)==1)
                    b2.setText("O");
                else b2.setText("X");
win();
                break;

            case R.id.button9:

                if(setin(8)==1)
                    b9.setText("O");
                else b9.setText("X");
win();
                break;

            case R.id.textView:
                AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                dialog.create();
                dialog.setTitle("Pick your letter");

                dialog.setPositiveButton("O",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dtext.setText("Player 1 'O'");

                        what = true;

                    }
                });
                dialog.setNegativeButton("X",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dtext.setText("Player 1 'X'");

                        what = false;
                    }
                });
                dialog.show();
otext.setEnabled(true);
otext.setTypeface(null, Typeface.BOLD);
otext.setText("Start Board");

dtext.setTextSize(20);
dtext.setTypeface(null, Typeface.BOLD);
                break;

            case R.id.dummy_button:
                    otext.setText("RESET");
                    otext.setEnabled(true);
             b.setEnabled(true); b.setText(R.string.enter);
             b2.setEnabled(true); b2.setText(R.string.enter);
             b3.setEnabled(true); b3.setText(R.string.enter);
             b4.setEnabled(true); b4.setText(R.string.enter);
             b5.setEnabled(true); b5.setText(R.string.enter);
             b6.setEnabled(true); b6.setText(R.string.enter);
             b7.setEnabled(true); b7.setText(R.string.enter);
             b8.setEnabled(true); b8.setText(R.string.enter);
             b9.setEnabled(true); b9.setText(R.string.enter);
             dtext.setEnabled(true);

for (int x=0; x<=8; x++){
    arr[x] = 'a';
}

                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);



        TextView dtext = findViewById(R.id.textView);

        TextView otext = findViewById(R.id.fullscreen_content);


        otext.setText("Welcome to Tic Tac Toe");
        dtext.setText("Touch to pick letter");
        dtext.setOnClickListener(this);

        Button b = findViewById(R.id.button);
        b.setEnabled(false);
        b.setOnClickListener( this);
        Button b1 = findViewById(R.id.button2);
        b1.setEnabled(false);
        b1.setOnClickListener(this);
        Button b2 = findViewById(R.id.button3);
        b2.setEnabled(false);
        b2.setOnClickListener( this);
        Button b3 = findViewById(R.id.button4);
        b3.setEnabled(false);
        b3.setOnClickListener(this);
        Button b4 = findViewById(R.id.button5);
        b4.setEnabled(false);
        b4.setOnClickListener( this);
        Button b5 = findViewById(R.id.button6);
        b5.setEnabled(false);
        b5.setOnClickListener(this);
        Button b6 = findViewById(R.id.button7);
        b6.setEnabled(false);
        b6.setOnClickListener( this);
        Button b7 = findViewById(R.id.button8);
        b7.setEnabled(false);
        b7.setOnClickListener(this);
        Button b8 = findViewById(R.id.button9);
        b8.setEnabled(false);
        b8.setOnClickListener( this);
        Button db = findViewById(R.id.dummy_button);
        otext.setTypeface(null, Typeface.BOLD);

        db.setText("WELCOME");
        db.setEnabled(false);
        db.setOnClickListener(this);

    }






























void Edittoast(String xo){
    Toast toast = new Toast(getApplicationContext());
    toast.setGravity(Gravity.CENTER,10,100);

    TextView tv = new TextView(MainActivity.this);
    tv.setBackgroundColor(Color.BLACK);
    tv.setTextColor(Color.WHITE);
    tv.setTextSize(30);
    Typeface t = Typeface.create("calibri", Typeface.BOLD_ITALIC);
    tv.setTypeface(t);
    tv.setPadding(15,10,20,10);
    tv.setText(xo);
    toast.setView(tv);
    toast.show();

}


    void win() {
        if (arr[0] == X && arr[1] == X && arr[2] == X ) {

            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[3] == X && arr[4] == X && arr[5] == X) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[6] == X && arr[7] == X && arr[8] == X) {

            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[0] == X && arr[3] == X && arr[6] == X) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[2] == X && arr[5] == X && arr[8] == X) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[1] == X && arr[4] == X && arr[7] == X) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[0] == X && arr[4] == X && arr[8] == X) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[2] == X && arr[4] == X && arr[6] == X) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }

        if (arr[0] == O && arr[1] == O && arr[2] == O ) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }

        if (arr[3] == O && arr[4] == O && arr[5] == O) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[6] == O && arr[7] == O && arr[8] == O) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[0] == O && arr[3] == O && arr[6] == O) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[2] == O && arr[5] == O && arr[8] == O) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[1] == O && arr[4] == O && arr[7] == O) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[0] == O && arr[4] == O && arr[8] == O) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }
        if (arr[2] == O && arr[4] == O && arr[6] == O) {
            if (what) {
                Edittoast(O + " Winner");
            } else  {
                Edittoast(X + " Winner");
            }

        }

    }


}
