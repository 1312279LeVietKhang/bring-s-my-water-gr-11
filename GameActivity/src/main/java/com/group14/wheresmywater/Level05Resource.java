package com.group14.wheresmywater;

import org.andengine.audio.music.Music;
import org.andengine.audio.music.MusicFactory;
import org.andengine.audio.sound.Sound;
import org.andengine.audio.sound.SoundFactory;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.texture.region.TiledTextureRegion;

import java.io.IOException;
import java.util.ArrayList;

/**
 * The Class level05Resource.
 */
public class Level05Resource {

	/** The resource manager. */
	private ResourcesManager resourceManager = ResourcesManager.getInstance();

	/** The wall region. */
	public TextureRegion wall_Region; 

	/** The wall textureatlas. */
	private BitmapTextureAtlas wallTextureAtlas; 

	/** The rock region. */
	public TextureRegion rock_Region; 

	/** The rock textureatlas. */
	private BitmapTextureAtlas rockTextureAtlas; 

	/** The wate region. */
	public TextureRegion water_Region; 

	/** The water texture atlas. */
	private BitmapTextureAtlas waterTextureAtlas; 

	/** The btn replay region. */
	public TextureRegion btnRePlay_Region; 

	/** The btn replay textureatlas. */
	private BitmapTextureAtlas btnRePlayTextureAtlas; 

	/** The btn pause region. */
	public TextureRegion btnPause_Region; 

	/** The btnpause textureatlas. */
	private BitmapTextureAtlas btnPauseTextureAtlas;

	/** The cranky wait region. */
	public TiledTextureRegion crankyWait_Region; 

	/** The cranky wait textureatlas. */
	private BitmapTextureAtlas crankyWaitTextureAtlas; 

	/** The cranky have water region. */
	public TiledTextureRegion crankyHaveWater_Region; 

	/** The cranky have water textureatlas. */
	private BitmapTextureAtlas crankyHaveWaterTextureAtlas; 

	/** The listduckywater_region. */
	public ArrayList<TextureRegion> listduckywater_region;

	/** The listduckywater textureatlas. */
	private ArrayList<BitmapTextureAtlas> listduckywaterTextureAtlas;

	/** The sound game win. */
	public Sound soundGameWin;

	/** The sound water drop. */
	public Sound soundWaterDrop;

	/** The sound ducky. */
	public Sound soundDucky;

	/** The sound cranky cry. */
	public Sound soundCrankyCry;

	/** The sound cranky laugh. */
	public Sound soundCrankyLaugh;

	/** The music. */
	public Music music;

	/**
	 * Load.
	 */
	public void load() {
		loadGraphic();
		loadAudio();
	}

	/**
	 * Load graphic.
	 */
	private void loadGraphic() {
		// TODO Auto-generated method stub
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/");
		rockTextureAtlas = new BitmapTextureAtlas(resourceManager.getTextureManager(), 800, 1200, TextureOptions.BILINEAR);
		rock_Region = BitmapTextureAtlasTextureRegionFactory.createFromAsset(rockTextureAtlas, resourceManager._activity, "rock_level05.png", 0, 0);
		rockTextureAtlas.load();

		wallTextureAtlas = new BitmapTextureAtlas(resourceManager.getTextureManager(), 800, 1280, TextureOptions.BILINEAR);
		wall_Region = BitmapTextureAtlasTextureRegionFactory.createFromAsset(wallTextureAtlas, resourceManager._activity, "wall.png", 0, 0);
		wallTextureAtlas.load();

		waterTextureAtlas = new BitmapTextureAtlas(resourceManager.getTextureManager(), 128, 128, TextureOptions.BILINEAR);
		water_Region = BitmapTextureAtlasTextureRegionFactory.createFromAsset(waterTextureAtlas, resourceManager._activity, "drop.png", 0, 0);
		waterTextureAtlas.load();

		crankyWaitTextureAtlas = new BitmapTextureAtlas(resourceManager.getTextureManager(), 512, 512, TextureOptions.BILINEAR_PREMULTIPLYALPHA); 
		crankyWait_Region= BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(crankyWaitTextureAtlas, resourceManager.getAssets(), "cranky_waitwater.png", 0, 0, 4, 4);  
		crankyWaitTextureAtlas.load();

		crankyHaveWaterTextureAtlas = new BitmapTextureAtlas(resourceManager.getTextureManager(), 512, 512, TextureOptions.BILINEAR_PREMULTIPLYALPHA); 
		crankyHaveWater_Region = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(crankyHaveWaterTextureAtlas, resourceManager.getAssets(), "cranky_havewater.png", 0, 0, 4, 4);  
		crankyHaveWaterTextureAtlas.load();

		btnRePlayTextureAtlas = new BitmapTextureAtlas(resourceManager.getTextureManager() , 512, 256, TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		btnRePlay_Region = BitmapTextureAtlasTextureRegionFactory.createFromAsset(btnRePlayTextureAtlas, resourceManager.getAssets(), "btnrestart.png", 0, 0);
		btnRePlayTextureAtlas.load();

		btnPauseTextureAtlas = new BitmapTextureAtlas(resourceManager.getTextureManager() , 64, 64, TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		btnPause_Region = BitmapTextureAtlasTextureRegionFactory.createFromAsset(btnPauseTextureAtlas, resourceManager.getAssets(), "btnpause.png", 0, 0);
		btnPauseTextureAtlas.load();

		int nducky = 6;
		listduckywater_region = new ArrayList<TextureRegion>();
		listduckywaterTextureAtlas = new ArrayList<BitmapTextureAtlas>();
		for (int i = 0; i < nducky; i++) {
			BitmapTextureAtlas bmp = new BitmapTextureAtlas(resourceManager.getTextureManager(), 64, 64, TextureOptions.BILINEAR_PREMULTIPLYALPHA); 
			TextureRegion region = BitmapTextureAtlasTextureRegionFactory.createFromAsset(bmp, resourceManager.getAssets(), "ducky_duck_water" + String.valueOf(i) + ".png", 0, 0);  
			bmp.load();

			listduckywater_region.add(region);
			listduckywaterTextureAtlas.add(bmp);
		}
	}

	/**
	 * Load audio & music.
	 */
	private void loadAudio() {
		// TODO Auto-generated method stub
		SoundFactory.setAssetBasePath("sfx/");
		MusicFactory.setAssetBasePath("sfx/");
		try {
			soundGameWin = SoundFactory.createSoundFromAsset(resourceManager.getSoundManager(), resourceManager.getApplicationContext(), "gamewin.ogg");
			soundWaterDrop = SoundFactory.createSoundFromAsset(resourceManager.getSoundManager(), resourceManager.getApplicationContext(), "waterdrop.ogg");
			soundDucky = SoundFactory.createSoundFromAsset(resourceManager.getSoundManager(), resourceManager.getApplicationContext(), "ducky01.ogg");
			soundCrankyCry = SoundFactory.createSoundFromAsset(resourceManager.getSoundManager(), resourceManager.getApplicationContext(), "cranky_cry.ogg");
			soundCrankyLaugh = SoundFactory.createSoundFromAsset(resourceManager.getSoundManager(), resourceManager.getApplicationContext(), "cranky_laugh.ogg");
			music = MusicFactory.createMusicFromAsset(resourceManager.getMusicManager(), resourceManager.getApplicationContext(), "level_music.mp3");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Unload.
	 */
	public final void unload() {
		wallTextureAtlas.unload();
		wall_Region = null;

		rockTextureAtlas.unload();
		rock_Region = null;

		waterTextureAtlas.unload();
		water_Region = null;

		btnRePlayTextureAtlas.unload();
		btnRePlay_Region = null;

		btnPauseTextureAtlas.unload();
		btnPause_Region = null;

		crankyWaitTextureAtlas.unload();
		crankyWait_Region = null;

		crankyHaveWaterTextureAtlas.unload();
		crankyHaveWater_Region = null;

		for (BitmapTextureAtlas bmp : listduckywaterTextureAtlas) {
			bmp.unload();
		}
		listduckywaterTextureAtlas = null;

		listduckywater_region = null;
	}
}
