/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;


import data.DataGenerator;

import sort.methods.Bubblesort;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        double[] dataNonSort = DataGenerator.generate(10000);

       /* Wzorzec Stratega */
        //...

        Context ctx = new Context((Strategy) new Bubblesort());
        ctx.arrange(dataNonSort);

        System.out.println("Time: ??");
    }
}

class Context{
        private final Strategy strategy;
        public Context(Strategy strategy) {
            this.strategy = strategy;
    }

        public void arrange(double[] input) {
            strategy.sort(input);
    }
}