package edwardbil_soundboard.gkain.edwardbil;


import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener {
    MediaPlayer mediaPlayer;


Button button1;
Button button2;
Button button3;
Button button4;
Button button5;
Button button6;
Button button7;
Button button8;
Button button9;
Button button10;
Button button11;
Button button12;
Button button13;
Button button14;
Button button15;
Button button16 ,button17,button18,button19,button20,button21,button22,button23,button24,button25,
    button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39,button40,
        button41,button42,button43,button44,button45,button46,button47,button48;
ImageView shareview;
TextView header;

int colorInt=0;
int adsInt=0;

private InterstitialAd mInterstitialAd;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main,
                container, false);

        MobileAds.initialize(getActivity(),
                "ca-app-pub-1336421761813784~9789190223");

        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId("ca-app-pub-1336421761813784/9029646474");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);
        button4 = view.findViewById(R.id.button4);
        button5 = view.findViewById(R.id.button5);
        button6 = view.findViewById(R.id.button6);
        button7 = view.findViewById(R.id.button7);
        button8 = view.findViewById(R.id.button8);
        button9 = view.findViewById(R.id.button9);
        button10 = view.findViewById(R.id.button10);
        button11 = view.findViewById(R.id.button11);
        button12 = view.findViewById(R.id.button12);
        button13 = view.findViewById(R.id.button13);
        button14 = view.findViewById(R.id.button14);
        button15 = view.findViewById(R.id.button15);
        button16 = view.findViewById(R.id.button16);


        button17 = view.findViewById(R.id.button17);
        button18 = view.findViewById(R.id.button18);
        button19 = view.findViewById(R.id.button19);
        button20 = view.findViewById(R.id.button20);
        button21 = view.findViewById(R.id.button21);
        button22 = view.findViewById(R.id.button22);
        button23 = view.findViewById(R.id.button23);
        button24 = view.findViewById(R.id.button24);
        button25 = view.findViewById(R.id.button25);
        button26 = view.findViewById(R.id.button26);
        button27 = view.findViewById(R.id.button27);
        button28 = view.findViewById(R.id.button28);
        button29 = view.findViewById(R.id.button29);
        button30 = view.findViewById(R.id.button30);
        button31 = view.findViewById(R.id.button31);
        button32 = view.findViewById(R.id.button32);
        button33 = view.findViewById(R.id.button33);
        button34 = view.findViewById(R.id.button34);
        button35 = view.findViewById(R.id.button35);
        button36 = view.findViewById(R.id.button36);
        button37 = view.findViewById(R.id.button37);
        button38 = view.findViewById(R.id.button38);
        button39 = view.findViewById(R.id.button39);
        button40 = view.findViewById(R.id.button40);


        button41 = view.findViewById(R.id.button41);
        button42 = view.findViewById(R.id.button42);
        button43 = view.findViewById(R.id.button43);
        button44 = view.findViewById(R.id.button44);
        button45 = view.findViewById(R.id.button45);
        button46 = view.findViewById(R.id.button46);
        button47 = view.findViewById(R.id.button47);
        button48 = view.findViewById(R.id.button48);


        shareview = view.findViewById(R.id.shareview);
        header = view.findViewById(R.id.header);

        // Inflate the layout for this fragment

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button26.setOnClickListener(this);
        button27.setOnClickListener(this);
        button28.setOnClickListener(this);
        button29.setOnClickListener(this);
        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        button34.setOnClickListener(this);
        button35.setOnClickListener(this);
        button36.setOnClickListener(this);
        button37.setOnClickListener(this);
        button38.setOnClickListener(this);
        button39.setOnClickListener(this);
        button40.setOnClickListener(this);

        button41.setOnClickListener(this);
        button42.setOnClickListener(this);
        button43.setOnClickListener(this);
        button44.setOnClickListener(this);
        button45.setOnClickListener(this);
        button46.setOnClickListener(this);
        button47.setOnClickListener(this);
        button48.setOnClickListener(this);






        shareview.setOnClickListener(this);
        header.setOnClickListener(this);

        return view;
    }

    public void secretView(int color){

        if (color==0) {
            header.setTextColor(Color.parseColor("#F6E4E6"));
        }

        if (color==1) {
            header.setTextColor(Color.parseColor("#EECDD0"));

        }

        if (color==2) {
            header.setTextColor(Color.parseColor("#DD979D"));

        }
        if (color==3) {
            header.setTextColor(Color.parseColor("#CD6069"));

        }
        if (color==4) {
            header.setTextColor(Color.parseColor("#CD323F"));

        }
        if (color==5) {
if(adsInt==0) {
    if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    } adsInt=1;
}

            MainActivity.fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, new SecretFragment())
                    .addToBackStack(null)
                    .commit();

            colorInt=0;
        }
    }

    @Override
    public void onClick(View view) {

        releaseMP();

        switch (view.getId()){
            case R.id.shareview:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Приложение Edward Bil Soundboard, скачать можно здесь - https://play.google.com/store/apps/details?id=edwardbil_soundboard.gkain.edwardbil");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent,"Поделиться"));

                break;

            case R.id.header:
                secretView(colorInt);
                colorInt++;
                break;


            case R.id.button1:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.davasrujit);
                mediaPlayer.start();
                break;
            case R.id.button2:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.davai);
                mediaPlayer.start();
                break;
            case R.id.button3:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.devushkipriver);
                mediaPlayer.start();
                break;
            case R.id.button4:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.drugnaz);
                mediaPlayer.start();
                break;
                case R.id.button5:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.xuiloanedrug);
                mediaPlayer.start();
                break;
            case R.id.button6:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.zombi);
                mediaPlayer.start();
                break;
                case R.id.button7:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.merzko);
                mediaPlayer.start();
                break;
            case R.id.button8:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.muravei);
                mediaPlayer.start();
                break;
            case R.id.button9:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.razvodnaloxa);
                mediaPlayer.start();
                break;
            case R.id.button10:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.snimai);
                mediaPlayer.start();
                break;
            case R.id.button11:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tishoboleeesh);
                mediaPlayer.start();
                break;
            case R.id.button12:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.uidi);
                mediaPlayer.start();
                break;
            case R.id.button13:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.shutka);
                mediaPlayer.start();
                break;
            case R.id.button14:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.neproshau);
                mediaPlayer.start();
                break;
            case R.id.button15:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.roboteduard);
                mediaPlayer.start();
                break;
            case R.id.button16:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.gav);
                mediaPlayer.start();
                break;
            case R.id.button17:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.spriatalcz);
                mediaPlayer.start();
                break;
            case R.id.button18:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.votpizd);
                mediaPlayer.start();
                break;
            case R.id.button19:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vremia);
                mediaPlayer.start();
                break;
            case R.id.button20:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.eslichto);
                mediaPlayer.start();
                break;
            case R.id.button21:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.stor);
                mediaPlayer.start();
                break;
            case R.id.button22:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sorry);
                mediaPlayer.start();
                break;
            case R.id.button23:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.inst);
                mediaPlayer.start();
                break;
            case R.id.button24:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pereputal);
                mediaPlayer.start();
                break;
            case R.id.button25:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.serriozno);
                mediaPlayer.start();
                break;
            case R.id.button26:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.smex);
                mediaPlayer.start();
                break;
            case R.id.button27:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.smextwo);
                mediaPlayer.start();
                break;
            case R.id.button28:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.takogonet);
                mediaPlayer.start();
                break;
            case R.id.button29:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tividel);
                mediaPlayer.start();
                break;
            case R.id.button30:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tsiii);
                mediaPlayer.start();
                break;
            case R.id.button31:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tidaone);
                mediaPlayer.start();
                break;
            case R.id.button32:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tida);
                mediaPlayer.start();
                break;
            case R.id.button33:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.mneskazal);
                mediaPlayer.start();
                break;
            case R.id.button34:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.telka);
                mediaPlayer.start();
                break;
            case R.id.button35:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.finalss);
                mediaPlayer.start();
                break;
            case R.id.button36:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.gusi);
                mediaPlayer.start();
                break;



            case R.id.button37:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.esatsss);
                mediaPlayer.start();
                break;
            case R.id.button38:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.ktone);
                mediaPlayer.start();
                break;
            case R.id.button39:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.ktoeto);
                mediaPlayer.start();
                break;

            case R.id.button40:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.neznaesh);
                mediaPlayer.start();
                break;


            case R.id.button41:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tineti);
                mediaPlayer.start();
                break;
            case R.id.button42:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.neti);
                mediaPlayer.start();
                break;
            case R.id.button43:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.razvodish);
                mediaPlayer.start();
                break;
            case R.id.button44:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.zubispira);
                mediaPlayer.start();
                break;


            case R.id.button45:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.vigei);
                mediaPlayer.start();
                break;
            case R.id.button46:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.nax);
                mediaPlayer.start();
                break;
            case R.id.button47:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tify);
                mediaPlayer.start();
                break;
            case R.id.button48:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.haha);
                mediaPlayer.start();
                break;




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
