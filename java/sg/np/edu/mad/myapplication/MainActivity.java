package sg.np.edu.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.sax.Element;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


import javax.xml.parsers.ParserConfigurationException;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Do not remove...
        //Try changing property from 'true' to 'false'
        User user1 = new User("Li Zhe Yun", "I am a Year 2 student studying the MAD module", 1000, false);

        Button b = findViewById(R.id.button_no1); //get the targetButton
        Button cfb = findViewById(R.id.confirmationFollowButton);
        Button cub = findViewById(R.id.confirmationUnfollowButton);
        //if property 'followed' stores the 'false' value then the text in the button would be 'FOLLOW', else 'UNFOLLOW'

        FrameLayout fl1 = findViewById(R.id.FrameLayout1);
        FrameLayout fl2 = findViewById(R.id.FrameLayout2);

        if (!user1.followed){ //if the user did not follow....
            b.setText("FOLLOW");
        }
        else{
            b.setText("UNFOLLOW");
        }

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (!user1.followed){ //property equates to false when
                    b.setText("UNFOLLOW");
                    //make the overlay screen appear...
                    user1.followed = true;
                    fl1.setVisibility(View.VISIBLE);
                    b.setEnabled(false);
                    //You can next click event listeners in java
                    cfb.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            fl1.setVisibility(View.GONE);
                            b.setEnabled(true);
                        }
                    });
                }
                else{
                    b.setText("FOLLOW");
                    user1.followed = false;
                    fl2.setVisibility(View.VISIBLE);
                    b.setEnabled(false);
                    cub.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            fl2.setVisibility(View.GONE);
                            b.setEnabled(true);
                        }
                    });
                }
            }
        });
    }
}
