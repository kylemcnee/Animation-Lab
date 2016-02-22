package generalassembly.yuliyakaleda.startercode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  Button mButton;
  EditText mEditText;
  TextView mAnimatedWish;
  ArrayList<String> mWishArray;
  ListView mWishList;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mButton = (Button)findViewById(R.id.button);
    mEditText = (EditText)findViewById(R.id.editText);
    mAnimatedWish = (TextView)findViewById(R.id.textView);
    mWishList = (ListView)findViewById(R.id.listView);

    mWishArray = new ArrayList<String>();



    mButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String wish = mEditText.getText().toString();
        mWishArray.add(wish);
        mAnimatedWish.setText(wish);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, mWishArray);
        mWishList.setAdapter(adapter);
          Collections.reverse(mWishArray);

        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation);
        mAnimatedWish.startAnimation(animation);
        mEditText.setText(null);

        Toast.makeText(MainActivity.this, "Your wish is my command", Toast.LENGTH_SHORT).show();
      }
    });


    // set up all the view and event listeners.
  }

  public void onClick(View v) {


    //       1. get the text from the input field
    //       2. animate it in the center of the screen
    //       3. add it to the list wish
    //       4. clear the input field
  }
}
