# spring-kafka-microservice-demo
A RESTful microservice example demonstrating real-time message streaming with Spring Boot and Apache Kafka (KRaft mode).

Spring Boot & Apache Kafka Microservice Demo 🚀
Bu proje, Spring Boot ve Apache Kafka (KRaft Mode) entegrasyonunu sergileyen temel bir Producer-Consumer uygulamasıdır.

🛠️ Teknolojiler
Java: 25
Framework: Spring Boot 
Messaging: Apache Kafka 3.9.1
Build Tool: Maven

🚀 Kurulum ve Çalıştırma
1. Kafka'yı Başlat
Kafka dizinine giderek sunucuyu ayağa kaldırın:

Bash
bin/kafka-server-start.sh config/server.properties
2. Uygulamayı Başlat
KafkaExampleApplication.java dosyasını IDE üzerinden çalıştırın.

3. Test Et (API)
Yeni bir terminal sekmesinden şu curl komutu ile mesaj gönderin:

Bash
curl -X POST http://localhost:8080/api/v1/messages \
     -H "Content-Type: application/json" \
     -d '{"message": "Kafka Testi Başarılı! 🚀🎉"}'
     
📊 Sonuç
Mesaj başarıyla gönderildiğinde, Spring Boot konsolunda şu logu göreceksiniz:
Listener Received Kafka Testi Başarılı! 🚀🎉
