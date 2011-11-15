package j15r.xna.platformer.html;

import playn.core.PlayN;
import playn.html.HtmlAssetManager;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;
import j15r.xna.platformer.core.Platformer;

public class PlatformerHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlAssetManager assets = HtmlPlatform.register().assetManager();
    assets.setPathPrefix("platformer/");
    PlayN.run(new Platformer());
  }
}
