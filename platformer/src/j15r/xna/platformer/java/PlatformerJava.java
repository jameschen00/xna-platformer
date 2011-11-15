package j15r.xna.platformer.java;

import playn.core.PlayN;
import playn.java.JavaAssetManager;
import playn.java.JavaPlatform;
import j15r.xna.platformer.core.Platformer;

public class PlatformerJava {

  public static void main(String[] args) {
    JavaAssetManager assets = JavaPlatform.register().assetManager();
    assets.setPathPrefix("src/j15r/xna/platformer/resources");
    PlayN.run(new Platformer());
  }
}
