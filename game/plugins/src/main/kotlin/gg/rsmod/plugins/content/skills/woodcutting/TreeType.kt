package gg.rsmod.plugins.content.skills.woodcutting

import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.api.cfg.Objs

/**
 * @author Tom <rspsmods@gmail.com>
 */
enum class TreeType(
    val level: Int,
    val xp: Double,
    val log: Int,
    val depleteChance: Int,
    val respawnTime: Int,
    val lowChance: Int,
    val highChance: Int,
    val objectIds: Array<Int>
) {
    TREE(
        level = 1,
        xp = 25.0,
        log = Items.LOGS,
        depleteChance = 0,
        respawnTime = 59,
        lowChance = 64,
        highChance = 200,
        arrayOf(
            Objs.TREE_1276,
            Objs.TREE_1277,
            Objs.TREE_1278,
            Objs.TREE_1280,
            Objs.TREE_1330,
            Objs.TREE_1331,
            Objs.TREE_1332,
            Objs.TREE_2410,
            Objs.TREE_2411,
            Objs.TREE_3033,
            Objs.TREE_3034,
            Objs.TREE_3036,
            Objs.TREE_3879,
            Objs.TREE_3881,
            Objs.TREE_3882,
            Objs.TREE_3883,
            Objs.TREE_5904,
            Objs.TREE_14308,
            Objs.TREE_14309,
            Objs.TREE_37477,
            Objs.TREE_37478,
            Objs.TREE_37652,
            Objs.TREE_38760,
            Objs.TREE_38782,
            Objs.TREE_38783,
            Objs.TREE_38784,
            Objs.TREE_38785,
            Objs.TREE_38786,
            Objs.TREE_38787,
            Objs.TREE_38788,
            Objs.TREE_39328,
            Objs.DYING_TREE,
            Objs.DEAD_TREE,
            Objs.DEAD_TREE_1283,
            Objs.DEAD_TREE_1284,
            Objs.DEAD_TREE_1285,
            Objs.DEAD_TREE_1286,
            Objs.DEAD_TREE_1289,
            Objs.DEAD_TREE_1291,
            Objs.DEAD_TREE_1365,
            Objs.DEAD_TREE_1383,
            Objs.DEAD_TREE_1384,
            Objs.DEAD_TREE_11866,
            Objs.DEAD_TREE_32294,
            Objs.DEAD_TREE_37481,
            Objs.DEAD_TREE_37482,
            Objs.DEAD_TREE_37483,
            Objs.DEAD_TREE_41713,
            Objs.DEAD_TREE_47594,
            Objs.DEAD_TREE_47596,
            Objs.DEAD_TREE_47598,
            Objs.DEAD_TREE_47600,
            Objs.SWAMP_TREE,
            Objs.SWAMP_TREE_3300,
            Objs.SWAMP_TREE_9354,
            Objs.SWAMP_TREE_9355,
            Objs.SWAMP_TREE_9366,
            Objs.SWAMP_TREE_9387,
            Objs.SWAMP_TREE_9388,
            Objs.SWAMP_TREE_58108,
            Objs.SWAMP_TREE_58109,
            Objs.SWAMP_TREE_58121,
            Objs.SWAMP_TREE_58135,
            Objs.SWAMP_TREE_58140,
            Objs.SWAMP_TREE_58141,
            Objs.SWAMP_TREE_58142,
            Objs.EVERGREEN,
            Objs.EVERGREEN_1316,
            Objs.EVERGREEN_1318,
            Objs.EVERGREEN_1319,
            Objs.EVERGREEN_54778,
            Objs.EVERGREEN_54787,
            Objs.EVERGREEN_57932,
            Objs.EVERGREEN_57934,
            Objs.EVERGREEN_57964
        )
    ),
    ACHEY(
        level = 1,
        xp = 25.0,
        log = Items.ACHEY_TREE_LOGS,
        depleteChance = 0,
        respawnTime = 59,
        lowChance = 64,
        highChance = 200,
        arrayOf(Objs.ACHEY_TREE, Objs.ACHEY_TREE_29088, Objs.ACHEY_TREE_29089, Objs.ACHEY_TREE_29090)
    ),
    OAK(
        level = 15,
        xp = 37.5,
        log = Items.OAK_LOGS,
        depleteChance = 8,
        respawnTime = 14,
        lowChance = 32,
        highChance = 100,
        arrayOf(
            Objs.OAK, Objs.OAK_3037, Objs.OAK_8467, Objs.OAK_11999, Objs.OAK_37479, Objs.OAK_38731, Objs.OAK_38732
        )
    ),
    WILLOW(
        level = 30,
        xp = 67.5,
        log = Items.WILLOW_LOGS,
        depleteChance = 8,
        respawnTime = 14,
        lowChance = 16,
        highChance = 50,
        arrayOf(
            Objs.WILLOW,
            Objs.WILLOW_142,
            Objs.WILLOW_2210,
            Objs.WILLOW_2372,
            Objs.WILLOW_37480,
            Objs.WILLOW_38616,
            Objs.WILLOW_38627,
            Objs.WILLOW_58006
        )
    ),
    TEAK(
        level = 35,
        xp = 85.0,
        log = Items.TEAK_LOGS,
        depleteChance = 8,
        respawnTime = 15,
        lowChance = 15,
        highChance = 46,
        arrayOf(Objs.TEAK, Objs.TEAK_15062, Objs.TEAK_46275)
    ),
    MAPLE(
        level = 45,
        xp = 100.0,
        log = Items.MAPLE_LOGS,
        depleteChance = 8,
        respawnTime = 59,
        lowChance = 8,
        highChance = 25,
        arrayOf(
            Objs.MAPLE_TREE_1307,
            Objs.MAPLE_TREE_4674,
            Objs.MAPLE_TREE_8444,
            Objs.MAPLE_TREE_46277,
            Objs.MAPLE_TREE_51843
        )
    ),
    HOLLOW(
        level = 45,
        xp = 82.0,
        log = Items.BARK,
        depleteChance = 8,
        respawnTime = 44,
        lowChance = 18,
        highChance = 26,
        arrayOf(Objs.HOLLOW_TREE, Objs.HOLLOW_TREE_2289, Objs.HOLLOW_TREE_4060)
    ),
    MAHOGANY(
        level = 50,
        xp = 125.0,
        log = Items.MAHOGANY_LOGS,
        depleteChance = 8,
        respawnTime = 14,
        lowChance = 8,
        highChance = 25,
        arrayOf(Objs.MAHOGANY, Objs.MAHOGANY_46274)
    ),
    YEW(
        level = 60,
        xp = 175.0,
        log = Items.YEW_LOGS,
        depleteChance = 8,
        respawnTime = 99,
        lowChance = 4,
        highChance = 12,
        arrayOf(Objs.YEW, Objs.YEW_12000, Objs.YEW_38755, Objs.YEW_38758, Objs.YEW_38759)
    ),
    IVY(
        level = 68,
        xp = 332.5,
        log = -1,
        depleteChance = 8, //TODO: find correct value
        respawnTime = 60,
        lowChance = 7,
        highChance = 11,
        arrayOf(Objs.IVY_46324, Objs.IVY_46322, Objs.IVY_46320, Objs.IVY_46318)
    ),
    MAGIC(
        level = 75,
        xp = 250.0,
        log = Items.MAGIC_LOGS,
        depleteChance = 8,
        respawnTime = 199,
        lowChance = 6,
        highChance = 6,
        arrayOf(Objs.MAGIC_TREE_1306, Objs.MAGIC_TREE_8409, Objs.MAGIC_TREE_37823)
    );

    companion object {
        val values = enumValues<TreeType>()
        val objects = TreeType.values().flatMap { it.objectIds.toList() }
    }
}