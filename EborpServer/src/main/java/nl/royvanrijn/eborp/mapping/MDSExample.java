package nl.royvanrijn.eborp.mapping;

//import mdsj.MDSJ;

import java.util.Arrays;

public class MDSExample {
    public static void main(String[] args) {

        //Input of the MDS algorithm is a map of all distances relative to each other
        String[][] data = new String[][] {
                {"Atlanta","0","587","1212","701","1936","604","748","2139","2182","543"},
                {"Chicago","587","0","920","940","1745","1188","713","1858","1737","597"},
                {"Denver","1212","920","0","879","831","1726","1631","949","1021","1494"},
                {"Houston","701","940","879","0","1374","968","1420","1645","1891","1220"},
                {"Los Angeles","1936","1745","831","1374","0","2339","2451","347","959","2300"},
                {"Miami","604","1188","1726","968","2339","0","1092","2594","2734","923"},
                {"New York","748","713","1631","1420","2451","1092","0","2571","2408","205"},
                {"San Francisco","2139","1858","949","1645","347","2594","2571","0","678","2442"},
                {"Seattle","2182","1737","1021","1891","959","2734","2408","678","0","2329"},
                {"Washington, DC","543","597","1494","1220","2300","923","205","2442","2329","0"},
        };

        // Turn into a table without label (needed for algorithm):
        double[][] input = new double[data.length][data[0].length-1];
        for(int i = 0; i<data.length; i++) {
            for(int x = 1; x<data[i].length; x++) {
                double d = Double.parseDouble(data[i][x]);
                input[i][x-1] = d;
            }
        }

        //Output the table for clarity:
        for(int i = 0; i<input.length; i++) {
            System.out.println(Arrays.toString(input[i]));
        }

        int n=input[0].length;    // number of data objects
        //double[][] output = MDSJ.stressMinimization(input);
//        double[][] output= MDSJ.classicalScaling(input); // apply MDS
        for(int i=0; i<n; i++) {  // output all coordinates
//            System.out.println(data[i][0] +"\t"+((int)output[0][i])+"\t"+(int)(output[1][i]));
        }
    }
}