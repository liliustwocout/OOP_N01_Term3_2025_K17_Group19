package main;

import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;

public class AssetSetter {

    GamePanel gp;

    public  AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public  void setObject() {

        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 31 * gp.tileSize;
        gp.obj[0].worldY = 6 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 18 * gp.tileSize;
        gp.obj[1].worldY = 18 * gp.tileSize;

        gp.obj[2] = new OBJ_Door();
        gp.obj[2].worldX = 37 * gp.tileSize;
        gp.obj[2].worldY = 36 * gp.tileSize;

        gp.obj[3] = new OBJ_Door();
        gp.obj[3].worldX = 20 * gp.tileSize;
        gp.obj[3].worldY = 18 * gp.tileSize;

        gp.obj[4] = new OBJ_Door();
        gp.obj[4].worldX = 42 * gp.tileSize;
        gp.obj[4].worldY = 36 * gp.tileSize;

        gp.obj[5] = new OBJ_Chest();
        gp.obj[5].worldX = 44 * gp.tileSize;
        gp.obj[5].worldY = 35 * gp.tileSize;

        gp.obj[6] = new OBJ_Key();
        gp.obj[6].worldX = 17 * gp.tileSize;
        gp.obj[6].worldY = 18 * gp.tileSize;

        gp.obj[7] = new OBJ_Boots();
        gp.obj[7].worldX = 22 * gp.tileSize;
        gp.obj[7].worldY = 18 * gp.tileSize;

    }
}
