package ru.vasic2000.gravity.classes;

import java.util.ArrayList;

import ru.vasic2000.gravity.utilites.SettingsGame;
import ru.vasic2000.my_framework.CoreFW;
import ru.vasic2000.my_framework.GraphicsFW;
import ru.vasic2000.gravity.utilites.UtilResourse;

public class LoaderAssets {
    public LoaderAssets(CoreFW coreFW, GraphicsFW graphicsFW) {
        loadTexture(graphicsFW);
        loadSpritePlayer(graphicsFW);
        loadSpriteEnemy(graphicsFW);
        loadShieldHitEnemy(graphicsFW);
        loadAudio(coreFW);
        loadScore(coreFW);
    }

    private void loadAudio(CoreFW coreFW) {
        UtilResourse.gameMusic = coreFW.getAudioFW().newMusic("music.mp3");
        UtilResourse.hit = coreFW.getAudioFW().newSound("hit.ogg");
        UtilResourse.explode = coreFW.getAudioFW().newSound("explode.ogg");
        UtilResourse.touch = coreFW.getAudioFW().newSound("touch.ogg");
    }

    private void loadScore(CoreFW coreFW) {
        SettingsGame.loadScore(coreFW);
    }

    private void loadShieldHitEnemy(GraphicsFW graphicsFW) {
        UtilResourse.shieldHitEnamy = graphicsFW.newSprite(UtilResourse.textureAtlas,
                0,128, 64,64);
    }

    private void loadTexture(GraphicsFW graphicsFW) {
        UtilResourse.textureAtlas = graphicsFW.newTexture("texture_atlas.png");
    }

    private void loadSpritePlayer(GraphicsFW graphicsFW) {
        UtilResourse.spritePlayer = new ArrayList<>();
        UtilResourse.spritePlayerBoost = new ArrayList<>();
        UtilResourse.spritePlayerExplose = new ArrayList<>();

        UtilResourse.spritePlayer.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                0, 0, 64, 64));
        UtilResourse.spritePlayer.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                64, 0, 64, 64));
        UtilResourse.spritePlayer.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                128, 0, 64, 64));
        UtilResourse.spritePlayer.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                192, 0, 64, 64));

        UtilResourse.spritePlayerBoost.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                0, 64, 64, 64));
        UtilResourse.spritePlayerBoost.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                64, 64, 64, 64));
        UtilResourse.spritePlayerBoost.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                128, 64, 64, 64));
        UtilResourse.spritePlayerBoost.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                192, 64, 64, 64));

        UtilResourse.spritePlayerExplose.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                256, 256, 64, 64));
        UtilResourse.spritePlayerExplose.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                320, 256, 64, 64));
        UtilResourse.spritePlayerExplose.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                384, 256, 64, 64));
        UtilResourse.spritePlayerExplose.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                448, 256, 64, 64));

    }

    private void loadSpriteEnemy(GraphicsFW graphicsFW) {
        UtilResourse.spriteEnemy = new ArrayList<>();
        UtilResourse.spriteEnemy.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                256, 0, 64, 64));
        UtilResourse.spriteEnemy.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                320, 0, 64, 64));
        UtilResourse.spriteEnemy.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                384, 0, 64, 64));
        UtilResourse.spriteEnemy.add(graphicsFW.newSprite(UtilResourse.textureAtlas,
                448, 0, 64, 64));
    }
}
