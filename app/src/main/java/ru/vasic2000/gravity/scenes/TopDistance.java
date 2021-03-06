package ru.vasic2000.gravity.scenes;

import android.graphics.Color;

import ru.vasic2000.gravity.R;
import ru.vasic2000.gravity.utilites.SettingsGame;
import ru.vasic2000.gravity.utilites.UtilResourse;
import ru.vasic2000.my_framework.core.CoreFW;
import ru.vasic2000.my_framework.core.SceneFW;

public class TopDistance extends SceneFW {

    private String[] mNumbers = new String[5];

    public TopDistance(CoreFW coreFW) {
        super(coreFW);
        for (int i = 0; i < 5; i++) {
            this.mNumbers[i] = " " + (i+1) + " = " + SettingsGame.distance[i];
        }
    }

    @Override
    public void update() {
        if(pCoreFW.getTouchListenerFW().getTuchUp(0, pSceneHeight, pSceneWidth, pSceneHeight)) {
            pCoreFW.setScene(new MainMenuScene(pCoreFW));
            UtilResourse.sTouch.play(1);
            SettingsGame.saveScore(pCoreFW);
        }
    }

    @Override
    public void drawing() {
        pGraficsFW.drawText(pCoreFW.getString(R.string.txt_top_distance),
                120, 200, Color.GREEN, 60, UtilResourse.sMainMenuFont);
        pGraficsFW.drawText(String.valueOf(mNumbers[0]),
                120, 270, Color.YELLOW, 45, UtilResourse.sMainMenuFont);
        pGraficsFW.drawText(String.valueOf(mNumbers[1]),
                120, 320, Color.YELLOW, 45, UtilResourse.sMainMenuFont);
        pGraficsFW.drawText(String.valueOf(mNumbers[2]),
                120, 370, Color.YELLOW, 45, UtilResourse.sMainMenuFont);
        pGraficsFW.drawText(String.valueOf(mNumbers[3]),
                120, 420, Color.YELLOW, 45, UtilResourse.sMainMenuFont);
        pGraficsFW.drawText(String.valueOf(mNumbers[4]),
                120, 470, Color.YELLOW, 45, UtilResourse.sMainMenuFont);

    }

    @Override
    public void dispose() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
        pGraficsFW.clearScene(Color.BLACK);
    }
}
