package com.group14.wheresmywater;

import org.andengine.audio.music.MusicManager;
import org.andengine.audio.sound.SoundManager;
import org.andengine.engine.Engine;
import org.andengine.engine.camera.Camera;
import org.andengine.opengl.font.FontManager;
import org.andengine.opengl.texture.TextureManager;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.BaseGameActivity;

import android.content.Context;
import android.content.res.AssetManager;

/**
 * The Class ResourcesManager.
 */
public class ResourcesManager {
	// ---------------------------------------------
	// VARIABLES
	// ---------------------------------------------

	/** The Constant INSTANCE. */
	private static final ResourcesManager INSTANCE = new ResourcesManager();

	/** The _engine. */
	public Engine _engine;

	/** The _activity. */
	public GameActivity _activity;

	/** The _camera. */
	public Camera _camera;

	/** The _vbom. */
	public VertexBufferObjectManager _vbom;

	// ---------------------------------------------
	// CLASS MANAGER RESOURCE SCENE
	// ---------------------------------------------
	/** The splash scene resource. */
	public SplashSceneResource _splashSceneResource;

	/** The main menu scene resource. */
	public MainMenuSceneResource _mainMenuSceneResource;

	/** The loading scene resource. */
	public LoadingSceneResource _loadingSceneResource;

	/** The score scene resource. */
	public ScoreSceneResource _scoreSceneResource;

	/** The level01 resource. */
	public Level01Resource _level01Resource;

	/** The level02 resource. */
	public Level02Resource _level02Resource;

	/** The level03 resource. */
	public Level03Resource _level03Resource;

	/** The level04 resource. */
	public Level04Resource _level04Resource;

	/** The level05 resource. */
	public Level05Resource _level05Resource;

	/** The level06 resource. */
	public Level06Resource _level06Resource;

	/** The level07 resource. */
	public Level07Resource _level07Resource;
	/** The level08 resource. */
	public Level08Resource _level08Resource;

	/** The level09 resource. */
	public Level09Resource _level09Resource;

	/** The level10 resource. */
	public Level10Resource _level10Resource;

	/** The level11 resource. */
	public Level11Resource _level11Resource;

	/** The level12 resource. */
	public Level12Resource _level12Resource;

	/** The level13 resource. */
	public Level13Resource _level13Resource;

	/** The level14 resource. */
	public Level14Resource _level14Resource;

	/** The level15 resource. */
	public Level15Resource _level15Resource;


	/** The select level resource. */
	public SelectLevelSceneResource _selectLevelResource;

	// ---------------------------------------------
	// LOAD & UNLOAD RESOURCE
	// ---------------------------------------------
	/**
	 * Load splash screen.
	 */
	public final void loadSplashScreen() {
		_splashSceneResource = new SplashSceneResource();
		_splashSceneResource.load();
	}

	/**
	 * Unload splash screen.
	 */
	public final void unloadSplashScreen() {
		if (_splashSceneResource != null) {
			_splashSceneResource.unload();
			_splashSceneResource = null;
		}
	}

	/**
	 * Load main menu screen.
	 */
	public final void loadMainMenuScreen() {
		_mainMenuSceneResource = new MainMenuSceneResource();
		_mainMenuSceneResource.load();
	}

	/**
	 * Unload main menu screen.
	 */
	public final void unloadMainMenuScreen() {
		if (_mainMenuSceneResource != null) {
			_mainMenuSceneResource.unload();
			_mainMenuSceneResource = null;
		}
	}

	/**
	 * Load loading screen.
	 */
	public final void loadLoadingScreen() {
		_loadingSceneResource = new LoadingSceneResource();
		_loadingSceneResource.load();
	}

	/**
	 * Unload loading screen.
	 */
	public final void unloadLoadingScreen() {
		if (_loadingSceneResource != null) {
			_loadingSceneResource.unload();
			_loadingSceneResource = null;
		}
	}

	/**
	 * Load level01 screen.
	 */
	public final void loadLevel01Screen() {
		_level01Resource = new Level01Resource();
		_level01Resource.load();
	}

	/**
	 * Unload level01 screen.
	 */
	public final void unloadLevel01Screen() {
		if (_level01Resource != null) {
			_level01Resource.unload();
			_level01Resource = null;
		}
	}

	/**
	 * Load level02 screen.
	 */
	public final void loadLevel02Screen() {
		_level02Resource = new Level02Resource();
		_level02Resource.load();
	}

	/**
	 * Unload level02 screen.
	 */
	public final void unloadLevel02Screen() {
		if (_level02Resource != null) {
			_level02Resource.unload();
			_level02Resource = null;
		}
	}

	/**
	 * Load level03 screen.
	 */
	public final void loadLevel03Screen() {
		_level03Resource = new Level03Resource();
		_level03Resource.load();
	}
	/**
	 * Unload level03 screen.
	 */
	public final void unloadLevel03Screen() {
		if (_level03Resource != null) {
			_level03Resource.unload();
			_level03Resource = null;
		}
	}
	/**
	 * Unload level04 screen.
	 */
	public final void unloadLevel04Screen() {
		if (_level04Resource != null) {
			_level04Resource.unload();
			_level04Resource = null;
		}
	}
	/** Load level4 resource**/
	public final void loadLevel04Screen() {
		_level04Resource = new Level04Resource();
		_level04Resource.load();
	}
	/**
	 * Unload level05 screen.
	 */
	public final void unloadLevel05Screen() {
		if (_level05Resource != null) {
			_level05Resource.unload();
			_level05Resource = null;
		}
	}
	/** Load level5 resource**/
	public final void loadLevel05Screen() {
		_level05Resource = new Level05Resource();
		_level05Resource.load();
	}
	/**
	 * Unload level06 screen.
	 */
	public final void unloadLevel06Screen() {
		if (_level06Resource != null) {
			_level06Resource.unload();
			_level06Resource = null;
		}
	}
	/** Load level6 resource**/
	public final void loadLevel06Screen() {
		_level06Resource = new Level06Resource();
		_level06Resource.load();
	}
	/**
	 * Unload level07 screen.
	 */
	public final void unloadLevel07Screen() {
		if (_level07Resource != null) {
			_level07Resource.unload();
			_level07Resource = null;
		}
	}
	/** Load level7 resource**/
	public final void loadLevel07Screen() {
		_level07Resource = new Level07Resource();
		_level07Resource.load();
	}
	/**
	 * Unload level08 screen.
	 */
	public final void unloadLevel08Screen() {
		if (_level08Resource != null) {
			_level08Resource.unload();
			_level08Resource = null;
		}
	}
	/** Load level8 resource**/
	public final void loadLevel08Screen() {
		_level08Resource = new Level08Resource();
		_level08Resource.load();
	}

	/**
	 * Unload level09 screen.
	 */
	public final void unloadLevel09Screen() {
		if (_level09Resource != null) {
			_level09Resource.unload();
			_level09Resource = null;
		}
	}
	/** Load level9 resource**/
	public final void loadLevel09Screen() {
		_level09Resource = new Level09Resource();
		_level09Resource.load();
	}
	/**
	 * Unload level10 screen.
	 */
	public final void unloadLevel10Screen() {
		if (_level10Resource != null) {
			_level10Resource.unload();
			_level10Resource = null;
		}
	}
	/** Load level10 resource**/
	public final void loadLevel10Screen() {
		_level10Resource = new Level10Resource();
		_level10Resource.load();
	}
	/**
	 * Unload level11 screen.
	 */
	public final void unloadLevel11Screen() {
		if (_level11Resource != null) {
			_level11Resource.unload();
			_level11Resource = null;
		}
	}
	/** Load level11 resource**/
	public final void loadLevel11Screen() {
		_level11Resource = new Level11Resource();
		_level11Resource.load();
	}
	/**
	 * Unload level12 screen.
	 */
	public final void unloadLevel12Screen() {
		if (_level12Resource != null) {
			_level12Resource.unload();
			_level12Resource = null;
		}
	}
	/** Load level12 resource**/
	public final void loadLevel12Screen() {
		_level12Resource = new Level12Resource();
		_level12Resource.load();
	}
	/**
	 * Unload level13 screen.
	 */
	public final void unloadLevel13Screen() {
		if (_level13Resource != null) {
			_level13Resource.unload();
			_level13Resource = null;
		}
	}
	/** Load level13 resource**/
	public final void loadLevel13Screen() {
		_level13Resource = new Level13Resource();
		_level13Resource.load();
	}
	/**
	 * Unload level014 screen.
	 */
	public final void unloadLevel14Screen() {
		if (_level14Resource != null) {
			_level14Resource.unload();
			_level14Resource = null;
		}
	}
	/** Load level14 resource**/
	public final void loadLevel14Screen() {
		_level14Resource = new Level14Resource();
		_level14Resource.load();
	}

	/**
	 * Unload level015 screen.
	 */
	public final void unloadLevel15Screen() {
		if (_level15Resource != null) {
			_level15Resource.unload();
			_level15Resource = null;
		}
	}
	/** Load level15 resource**/
	public final void loadLevel15Screen() {
		_level15Resource = new Level15Resource();
		_level15Resource.load();
	}







	/**
	 * Load score screen.
	 */
	public final void loadScoreScreen() {
		_scoreSceneResource = new ScoreSceneResource();
		_scoreSceneResource.load();
	}

	/**
	 * Unload score screen.
	 */
	public final void unloadScoreScreen() {
		if (_scoreSceneResource != null) {
			_scoreSceneResource.unload();
			_scoreSceneResource = null;
		}
	}

	/**
	 * Load select level screen.
	 */
	public final void loadSelectLevelScreen() {
		_selectLevelResource = new SelectLevelSceneResource();
		_selectLevelResource.load();
	}

	/**
	 * Unload select level screen.
	 */
	public final void unloadSelectLevelScreen() {
		if (_selectLevelResource != null) {
			_selectLevelResource.unload();
			_selectLevelResource = null;
		}
	}

	/**
	 * Prepare manager.
	 *
	 * @param engine the engine
	 * @param activity the activity
	 * @param camera the camera
	 * @param vbom <br>
	 * <br>
	 * We use this method at beginning of game loading, to prepare
	 * Resources Manager properly, setting all needed parameters, so
	 * we can latter access them from different classes (eg. scenes)
	 */
	public static void prepareManager(final Engine engine, GameActivity activity,
			Camera camera, VertexBufferObjectManager vbom) {
		getInstance()._engine = engine;
		getInstance()._activity = activity;
		getInstance()._camera = camera;
		getInstance()._vbom = vbom;
	}

	// ---------------------------------------------
	// GETTERS AND SETTERS
	// ---------------------------------------------
	/**
	 * Gets the single instance of ResourcesManager.
	 *
	 * @return single instance of ResourcesManager
	 */
	public static ResourcesManager getInstance() {
		return INSTANCE;
	}

	// ---------------------------------------------
	// GET MANAGERS
	// ---------------------------------------------
	/**
	 * Gets the font manager.
	 *
	 * @return the font manager
	 */
	public final FontManager getFontManager() {
		return _engine.getFontManager();
	}

	/**
	 * Gets the music manager.
	 *
	 * @return the music manager
	 */
	public final MusicManager getMusicManager() {
		return _engine.getMusicManager();
	}

	/**
	 * Gets the texture manager.
	 *
	 * @return the texture manager
	 */
	public final TextureManager getTextureManager() {
		return _engine.getTextureManager();
	}

	/**
	 * Gets the sound manager.
	 *
	 * @return the sound manager
	 */
	public final SoundManager getSoundManager() {
		return _engine.getSoundManager();
	}

	/**
	 * Gets the assets.
	 *
	 * @return the assets
	 */
	public final AssetManager getAssets() {
		return ((BaseGameActivity) _activity).getAssets();
	}

	/**
	 * Gets the application context.
	 *
	 * @return the application context
	 */
	public final Context getApplicationContext() {
		return _activity.getApplicationContext();
	}
}
