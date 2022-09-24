# Start the ZooKeeper service
# In clean Terminal and kafka directory run:
bin/zookeeper-server-start.sh config/zookeeper.properties

# Start the Kafka broker service
# In clean Terminal and kafka directory run:
bin/kafka-server-start.sh config/server.properties

# Start the Kafka topic
# In clean Terminal and kafka directory run:
bin/kafka-topics.sh --create --topic topic1 --bootstrap-server localhost:9092

# Start ElasticSearch Cluster
# In clean Terminal and kafka directory run:
docker run -p 9200:9200 \
  -e "discovery.type=single-node" \
  docker.elastic.co/elasticsearch/elasticsearch:7.10.0

