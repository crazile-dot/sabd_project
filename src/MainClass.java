import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple3;

public class MainClass {

    private static String pathToFile = "/data/dpc-covid19-ita-andamento-nazionale-latest.csv";

    public static void main (String[] args) {

        SparkConf conf = new SparkConf()
                .setMaster("local")
                .setAppName("Query 1");
        JavaSparkContext sc = new JavaSparkContext(conf);
        sc.setLogLevel("ERROR");

        JavaRDD<String> covid19File = sc.textFile(pathToFile);
        JavaRDD<Integer> values = covid19File.map()
        System.out.println(covid19File);

        /*JavaRDD<Tuple3<String, String, Double>> value = Query1Preprocessing.preprocessDataset(sc);

        System.out.println("Query 1 Spark SQL");
        Query1SparkSQL.process(value);*/

        sc.close();
    }
}
