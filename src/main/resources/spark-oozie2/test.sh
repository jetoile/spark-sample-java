/usr/hdp/current/spark2-client/bin/spark-submit \
    --master yarn \
    --deploy-mode cluster \
    --name sampleSpark \
    --class fr.jetoile.spark.Main \
    --num-executor 5 \
    spark-sample-java-1.0-SNAPSHOT.jar \
    -i $1 \
    -o $2
