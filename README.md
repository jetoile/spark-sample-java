Simple Spark jobs with their Oozie's workflow on HDP 2.6.5 for validation tests on AWS or HDInsight

__Note:__ 

* jar can be run with spark-submit:

```bash
export nameNode=abfs://filesystem@container.dfs.core.windows.net
export userName=user

/usr/hdp/current/spark2-client/bin/spark-submit \
    --master yarn \
    --deploy-mode cluster \
    --name sampleSpark \
    --class fr.jetoile.spark.Main \
    --num-executor 5 \
    spark-sample-java-1.0-SNAPSHOT.jar \
    -i ${nameNode}/user/${userName}/example-spark1/data-in \
    -o ${nameNode}/user/${userName}/example-spark1/data-out
```

* oozie test: ok
* spark-oozie1: fail because spark2's action are not in the oozie's sharelib
* spark-oozie2: ok


__oozie cmd:__

* `oozie job -config job.properties -submit`
* `oozie job -config job.properties -run`
* `oozie job -info xxx`
* `oozie job -kill xxx`
* `oozie job -log xxx`