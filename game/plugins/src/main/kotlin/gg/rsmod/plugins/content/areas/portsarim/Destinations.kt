package gg.rsmod.plugins.content.areas.portsarim

import gg.rsmod.game.model.Tile
enum class Destinations(val tile: Tile, val cost: Int) {
    /*Crandor*/
    PORT_SARIM_TO_CRANDOR(tile = PORT_SARIM_TILE, 0),
    /*BRIMHAVEN avaliable locations */
    BRIMHAVEN_TO_CATHERBY(tile = BRIMHAVEN_TILE, cost = 480),
    BRIMHAVEN_TO_KARAMJA(tile = BRIMHAVEN_TILE, cost = 200),
    BRIMHAVEN_TO_MOS_LE_HARMLESS(tile = BRIMHAVEN_TILE, cost = 975),
    BRIMHAVEN_TO_PORT_KHAZARD(tile = BRIMHAVEN_TILE, cost = 400),
    BRIMHAVEN_TO_PORT_PHASMATYS(tile = BRIMHAVEN_TILE, cost = 2900),
    BRIMHAVEN_TO_PORT_SARIM(tile = BRIMHAVEN_TILE, cost = 1600),
    BRIMHAVEN_TO_SHIPYARD(tile = BRIMHAVEN_TILE, cost = 400),
    BRIMHAVEN_TO_PORT_TYRAS(tile = BRIMHAVEN_TILE, cost = 3200),
    BRIMHAVEN_TO_OO_GLOG(tile = BRIMHAVEN_TILE, cost = 3800),

    /*CATHERBY avaliable locations */
    CATHERBY_TO_BRIMHAVEN(tile = CATHERYBY_TILE, cost = 480),
    CATHERBY_TO_KARAMJA(tile = CATHERYBY_TILE, cost = 480),
    CATHERBY_TO_MOS_LE_HARMLESS(tile = CATHERYBY_TILE, cost = 1750),
    CATHERBY_TO_PORT_KHAZARD(tile = CATHERYBY_TILE, cost = 1600),
    CATHERBY_TO_PORT_PHASMATYS(tile = CATHERYBY_TILE, cost = 2500),
    CATHERBY_TO_PORT_SARIM(tile = CATHERYBY_TILE, cost = 1000),
    CATHERBY_TO_SHIPYARD(tile = CATHERYBY_TILE, cost = 1600),
    CATHERBY_TO_PORT_TYRAS(tile = CATHERYBY_TILE, cost = 3200),
    CATHERBY_TO_OO_GLOG(tile = CATHERYBY_TILE, cost = 3400),

    /*KARAMJA avaliable locations */
    KARAMJA_TO_BRIMHAVEN(tile = KARAMJA_TILE, cost = 200),
    KARAMJA_TO_CATHERBY(tile = KARAMJA_TILE, cost = 480),
    KARAMJA_TO_MOS_LE_HARMLESS(tile = KARAMJA_TILE, cost = 225),
    KARAMJA_TO_PORT_KHAZARD(tile = KARAMJA_TILE, cost = 400),
    KARAMJA_TO_PORT_PHASMATYS(tile = KARAMJA_TILE, cost = 2900),
    KARAMJA_TO_SHIPYARD(tile = KARAMJA_TILE, cost = 200),
    KARAMJA_TO_PORT_TYRAS(tile = KARAMJA_TILE, cost = 3200),
    KARAMJA_TO_OO_GLOG(tile = KARAMJA_TILE, cost = 2000),

    /*MOS_LE_HARMLESS avaliable locations */
    MOS_LE_HARMLESS_TO_BRIMHAVEN(tile = MOS_LE_HARMLESS_TILE, cost = 725),
    MOS_LE_HARMLESS_TO_CATHERBY(tile = MOS_LE_HARMLESS_TILE, cost = 625),
    MOS_LE_HARMLESS_TO_KARAMJA(tile = MOS_LE_HARMLESS_TILE, cost = 1025),
    MOS_LE_HARMLESS_TO_PORT_KHAZARD(tile = MOS_LE_HARMLESS_TILE, cost = 1025),
    MOS_LE_HARMLESS_TO_PORT_SARIM(tile = MOS_LE_HARMLESS_TILE, cost = 325),
    MOS_LE_HARMLESS_TO_SHIPYARD(tile = MOS_LE_HARMLESS_TILE, cost = 275),
    MOS_LE_HARMLESS_TO_PORT_TYRAS(tile = MOS_LE_HARMLESS_TILE, cost = 1600),
    MOS_LE_HARMLESS_TO_OO_GLOG(tile = MOS_LE_HARMLESS_TILE, cost = 500),

    /*PORT_KHAZARD avaliable locations */
    PORT_KHAZARD_TO_BRIMHAVEN(tile = PORT_KHAZARD_TILE, cost = 1600),
    PORT_KHAZARD_TO_CATHERBY(tile = PORT_KHAZARD_TILE, cost = 1600),
    PORT_KHAZARD_TO_KARAMJA(tile = PORT_KHAZARD_TILE, cost = 1600),
    PORT_KHAZARD_TO_MOS_LE_HARMLESS(tile = PORT_KHAZARD_TILE, cost = 1025),
    PORT_KHAZARD_TO_PORT_PHASMATYS(tile = PORT_KHAZARD_TILE, cost = 4100),
    PORT_KHAZARD_TO_PORT_SARIM(tile = PORT_KHAZARD_TILE, cost = 1280),
    PORT_KHAZARD_TO_SHIPYARD(tile = PORT_KHAZARD_TILE, cost = 1600),
    PORT_KHAZARD_TO_PORT_TYRAS(tile = PORT_KHAZARD_TILE, cost = 3200),
    PORT_KHAZARD_TO_OO_GLOG(tile = PORT_KHAZARD_TILE, cost = 5000),

    /*PORT_PHASMATYS avaliable locations */
    PORT_PHASMATYS_TO_BRIMHAVEN(tile = PORT_PHASMATYS_TILE, cost = 2900),
    PORT_PHASMATYS_TO_CATHERBY(tile = PORT_PHASMATYS_TILE, cost = 3500),
    PORT_PHASMATYS_TO_KARAMJA(tile = PORT_PHASMATYS_TILE, cost = 2900),
    PORT_PHASMATYS_TO_PORT_KHAZARD(tile = PORT_PHASMATYS_TILE, cost = 4100),
    PORT_PHASMATYS_TO_PORT_SARIM(tile = PORT_PHASMATYS_TILE, cost = 1300),
    PORT_PHASMATYS_TO_PORT_TYRAS(tile = PORT_PHASMATYS_TILE, cost = 3200),
    PORT_PHASMATYS_TO_OO_GLOG(tile = PORT_PHASMATYS_TILE, cost = 2800),

    /*PORT_SARIM avaliable locations */
    PORT_SARIM_TO_BRIMHAVEN(tile = PORT_SARIM_TILE, cost = 1600),
    PORT_SARIM_TO_CATHERBY(tile = PORT_SARIM_TILE, cost = 1000),
    PORT_SARIM_TO_MOS_LE_HARMLESS(tile = PORT_SARIM_TILE, cost = 325),
    PORT_SARIM_TO_PORT_KHAZARD(tile = PORT_SARIM_TILE, cost = 1280),
    PORT_SARIM_TO_PORT_PHASMATYS(tile = PORT_SARIM_TILE, cost = 1300),
    PORT_SARIM_TO_SHIPYARD(tile = PORT_SARIM_TILE, cost = 400),
    PORT_SARIM_TO_PORT_TYRAS(tile = PORT_SARIM_TILE, cost = 3200),
    PORT_SARIM_TO_OO_GLOG(tile = PORT_SARIM_TILE, cost = 1400),

    /*SHIPYARD avaliable locations */
    SHIPYARD_TO_BRIMHAVEN(tile = SHIPYARD_TILE, cost = 400),
    SHIPYARD_TO_CATHERBY(tile = SHIPYARD_TILE, cost = 1600),
    SHIPYARD_TO_KARAMJA(tile = SHIPYARD_TILE, cost = 200),
    SHIPYARD_TO_MOS_LE_HARMLESS(tile = SHIPYARD_TILE, cost = 225),
    SHIPYARD_TO_PORT_KHAZARD(tile = SHIPYARD_TILE, cost = 720),
    SHIPYARD_TO_PORT_SARIM(tile = SHIPYARD_TILE, cost = 400),
    SHIPYARD_TO_PORT_TYRAS(tile = SHIPYARD_TILE, cost = 3200),
    SHIPYARD_TO_OO_GLOG(tile = SHIPYARD_TILE, cost = 900),

    /*PORT_TYRAS avaliable locations */
    PORT_TYRAS_TO_BRIMHAVEN(tile = PORT_TYRAS_TILE, cost = 3200),
    PORT_TYRAS_TO_CATHERBY(tile = PORT_TYRAS_TILE, cost = 3200),
    PORT_TYRAS_TO_KARAMJA(tile = PORT_TYRAS_TILE, cost = 3200),
    PORT_TYRAS_TO_MOS_LE_HARMLESS(tile = PORT_TYRAS_TILE, cost = 1600),
    PORT_TYRAS_TO_PORT_KHAZARD(tile = PORT_TYRAS_TILE, cost = 3200),
    PORT_TYRAS_TO_PORT_PHASMATYS(tile = PORT_TYRAS_TILE, cost = 3200),
    PORT_TYRAS_TO_PORT_SARIM(tile = PORT_TYRAS_TILE, cost = 3200),
    PORT_TYRAS_TO_SHIPYARD(tile = PORT_TYRAS_TILE, cost = 3200),
    PORT_TYRAS_TO_OO_GLOG(tile = PORT_TYRAS_TILE, cost = 3200),

    /*OO_GLOG avaliable locations */
    OO_GLOG_TO_BRIMHAVEN(tile = OO_GLOG_TILE, cost = 3800),
    OO_GLOG_TO_CATHERBY(tile = OO_GLOG_TILE, cost = 3400),
    OO_GLOG_TO_KARAMJA(tile = OO_GLOG_TILE, cost = 2000),
    OO_GLOG_TO_MOS_LE_HARMLESS(tile = OO_GLOG_TILE, cost = 550),
    OO_GLOG_TO_PORT_KHAZARD(tile = OO_GLOG_TILE, cost = 5000),
    OO_GLOG_TO_PORT_PHASMATYS(tile = OO_GLOG_TILE, cost = 2800),
    OO_GLOG_TO_PORT_SARIM(tile = OO_GLOG_TILE, cost = 1400),
    OO_GLOG_TO_SHIPYARD(tile = OO_GLOG_TILE, cost = 900),
    OO_GLOG_TO_PORT_TYRAS(tile = OO_GLOG_TILE, cost = 3200),
    ;
}