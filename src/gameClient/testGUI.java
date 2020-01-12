package gameClient;

import Server.Game_Server;
import Server.game_service;
import dataStructure.DGraph;

public class testGUI {

    public static void main(String[] args) {

        int scenario_num = 5;
        game_service game = Game_Server.getServer(scenario_num);
        String g = game.getGraph();
        DGraph dGraph = new DGraph(g);
        myGameGUI gameGUI = new myGameGUI(dGraph, scenario_num, game);
    }
}