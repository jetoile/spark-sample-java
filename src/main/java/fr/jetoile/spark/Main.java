package fr.jetoile.spark;

import com.beust.jcommander.JCommander;
import org.apache.spark.sql.SparkSession;


public class Main {

    private static CommandLineArgs cmd = new CommandLineArgs();

    private static void parseArgs(String... args) {

        JCommander.newBuilder()
                .addObject(new Object[] {cmd})
                .build()
                .parse(args);
    }

    public static void main(String... args) {
        parseArgs(args);

        SparkSession sparkSession = SparkSession.builder().appName("simpleApp").getOrCreate();

        SimpleJob job = new SimpleJob(sparkSession);
        job.readAndWrite(cmd.inputPath, cmd.outputPath);

        sparkSession.close();

    }

}
