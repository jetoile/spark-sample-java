package fr.jetoile.spark;


import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SimpleJob {

    SparkSession sparkSession;

    public SimpleJob(SparkSession sparkSession) {
        this.sparkSession = sparkSession;
    }

    public void readAndWrite(String input, String output) {
        Dataset<Row> df = sparkSession.read().csv(input);

        df.show();

        df.write().parquet(output);
  }

}
