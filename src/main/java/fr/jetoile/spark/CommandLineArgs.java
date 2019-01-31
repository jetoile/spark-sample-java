package fr.jetoile.spark;

import com.beust.jcommander.Parameter;

public class CommandLineArgs {

  @Parameter(
          names = {"-h", "--help"}, help = true)
  public boolean help = false;

  @Parameter(
          names = {"-i", "--inputPath"}, description = "s3/adls input path", required = true)
  public String inputPath = "";

  @Parameter(
          names = {"-o", "--outputPath"}, description = "s3/adls output path", required = true)
  public String outputPath = "";

}
