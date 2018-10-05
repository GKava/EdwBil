package edwardbil_soundboard.gkain.edwardbil;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecretFragment extends Fragment implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button randoms;
    MediaPlayer mediaPlayer;
    Random random = new Random();

    public SecretFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast toast = Toast.makeText(getActivity(),
                "Вы перешли в Secret Soundboard", Toast.LENGTH_SHORT);
        toast.show();

View view =inflater.inflate(R.layout.fragment_secret, container, false);
        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);
        button4 = view.findViewById(R.id.button4);
        randoms = view.findViewById(R.id.randoms);


        // Inflate the layout for this fragment
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        randoms.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        releaseMP();

        switch (view.getId()) {
            case R.id.button1:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.think);
                mediaPlayer.start();
                break;
            case R.id.button2:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.netupi);
                mediaPlayer.start();
                break;

            case R.id.button3:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.moloko);
                mediaPlayer.start();
                break;
            case R.id.button4:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pross);
                mediaPlayer.start();
                break;
            case R.id.randoms:
                int rnd = random.nextInt(36);
              randomSound(rnd);

                break;
        }
    }

    public void randomSound (int rand){


        if (rand == 1){
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.davasrujit);
        mediaPlayer.start();
        }if (rand == 2) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.davai);
            mediaPlayer.start();
        }if (rand == 3) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.devushkipriver);
            mediaPlayer.start();
        }if (rand == 4) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.drugnaz);
            mediaPlayer.start();
        }if (rand == 5) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.xuiloanedrug);
            mediaPlayer.start();
        }if (rand == 6) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.zombi);
            mediaPlayer.start();
        }  if (rand == 7) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.merzko);
            mediaPlayer.start();
        }if (rand == 8) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.muravei);
            mediaPlayer.start();
        }  if (rand == 9) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.razvodnaloxa);
            mediaPlayer.start();
        }  if (rand == 10) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.snimai);
            mediaPlayer.start();
        }  if (rand == 11) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tishoboleeesh);
            mediaPlayer.start();
        }  if (rand == 12) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.uidi);
            mediaPlayer.start();
        }  if (rand == 13) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.shutka);
            mediaPlayer.start();
        }  if (rand == 14) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.neproshau);
            mediaPlayer.start();
        }  if (rand == 15) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.roboteduard);
            mediaPlayer.start();
        }  if (rand == 16) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.gav);
            mediaPlayer.start();
        }  if (rand == 17) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.spriatalcz);
            mediaPlayer.start();
        }  if (rand == 18) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.votpizd);
            mediaPlayer.start();
        }  if (rand == 19) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vremia);
            mediaPlayer.start();
        }  if (rand == 20) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.eslichto);
            mediaPlayer.start();
        }  if (rand == 21) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.stor);
            mediaPlayer.start();
        }  if (rand == 22) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sorry);
            mediaPlayer.start();
        }  if (rand == 23) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.inst);
            mediaPlayer.start();
        }  if (rand == 24) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pereputal);
            mediaPlayer.start();
        }  if (rand == 25) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.serriozno);
            mediaPlayer.start();
        }  if (rand == 26) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.smex);
            mediaPlayer.start();
        }  if (rand == 27) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.smextwo);
            mediaPlayer.start();
        }  if (rand == 28) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.takogonet);
            mediaPlayer.start();
        }  if (rand == 29) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tividel);
            mediaPlayer.start();
        }  if (rand == 30) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tsiii);
            mediaPlayer.start();
        }  if (rand == 31) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tidaone);
            mediaPlayer.start();
        }  if (rand == 32) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tida);
            mediaPlayer.start();
        }  if (rand == 33) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.mneskazal);
            mediaPlayer.start();
        }  if (rand == 34) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.telka);
            mediaPlayer.start();
        }  if (rand == 35) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.finalss);
            mediaPlayer.start();
        }  if (rand == 36) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.gusi);
            mediaPlayer.start();
        }if (rand == 37) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.esatsss);
            mediaPlayer.start();
        }if (rand == 38) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.ktone);
            mediaPlayer.start();
        }if (rand == 39) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.ktoeto);
            mediaPlayer.start();
        }if (rand == 40) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.neznaesh);
            mediaPlayer.start();
        }if (rand == 41) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tineti);
            mediaPlayer.start();
        }if (rand == 42) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.neti);
            mediaPlayer.start();
        }if (rand == 43) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.razvodish);
            mediaPlayer.start();
        }if (rand == 44) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.zubispira);
            mediaPlayer.start();
        }if (rand == 45) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vigei);
            mediaPlayer.start();
        }if (rand == 46) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.nax);
            mediaPlayer.start();
        }if (rand == 47) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tify);
            mediaPlayer.start();
        }if (rand == 48) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.haha);
            mediaPlayer.start();
        }
    }


    private void releaseMP() {
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
                mediaPlayer = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        releaseMP();
    }
}
