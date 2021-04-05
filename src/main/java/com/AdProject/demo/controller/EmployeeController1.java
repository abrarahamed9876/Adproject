package com.adproject.demo.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.howtodoinjava.demo.model.Employee;
//import java.util.Iterator;
//import java.util.Properties;
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.apache.kafka.clients.consumer.ConsumerRecords;
//import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@RestController
//@RequestMapping("/Employee")
//public class EmployeeController {
//    
//    
//    
//    //get method
//    @GetMapping("/get")
//    public ResponseEntity<List<Employee>> getEmployees() {
//        System.out.println("--------------get method is started");
//        List<Employee> employeesList = new ArrayList<Employee>();
//        employeesList.add(new Employee(1, "lokesh", "gupta", "howtodoinjava@gmail.com"));
//        employeesList.add(new Employee(2, "abrar", "ahamed", "abc@gmail.com"));
//        return new ResponseEntity<>(employeesList, HttpStatus.OK);
//    }
//    
//    ////post method
//     @PostMapping("/post")
//    public ResponseEntity<List<Employee>> setEmployees(@RequestBody Employee employee) {
//        System.out.println("--------------post method is started");
//        List<Employee> employeesList = new ArrayList<Employee>();
//        employeesList.add(new Employee(1, "abc", "def", "howtodoinjava@gmail.com"));
//        employeesList.add(new Employee(2, "abrar", "ahamed", "abc@gmail.com"));
//        employeesList.add(employee);
//        return new ResponseEntity<>(employeesList, HttpStatus.OK);
//    }
//    
//    //get by id
//    @GetMapping("/post/{topicName}/{message}")
//    public ResponseEntity<String> getEmployeesById(@PathVariable String topicName,@PathVariable String message) {
//        System.out.
//                println("--------------get by id method is started");
//        
//         Properties properties = new Properties();
//        properties.put("bootstrap.servers", "localhost:9092");
//        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//
//        KafkaProducer kafkaProducer = new KafkaProducer(properties);
//        try{
//            for(int i = 0; i < 10; i++){
//                System.out.println(i);
////                kafkaProducer.send(new ProducerRecord("myTopic", Integer.toString(i), "test message - " + id ));
//                kafkaProducer.send(new ProducerRecord (topicName, message));
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            kafkaProducer.close();
//        }
//    
//        
//        
//        
//        return new ResponseEntity<>("Message posted to kafka successfully", HttpStatus.OK);
//        
//        
////        List<Employee> employeesList = new ArrayList<Employee>();
////        employeesList.add(new Employee(1, "lokesh", "gupta", "howtodoinjava@gmail.com"));
////        employeesList.add(new Employee(2, "abrar", "ahamed", "abc@gmail.com"));
////        Employee e=employeesList.get(id);
////        return new ResponseEntity<>(e, HttpStatus.OK);
//    }
//    
//    @GetMapping("/getmessages/{topicName}")
//    public ResponseEntity<List<String>> getEmployeesById2(@PathVariable String topicName) {
//        System.out.
//                println("--------------get by id method is started");
//        
//    Properties properties = new Properties();
//        properties.put("bootstrap.servers", "localhost:9092");
//        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        properties.put("group.id", "test-group");
//
//        KafkaConsumer kafkaConsumer = new KafkaConsumer(properties);
//        List topics = new ArrayList();
//        topics.add(topicName);
//        kafkaConsumer.subscribe(topics);
//        List ms = new ArrayList<String>();
//        try{
//            while (true){
//                ConsumerRecords records = kafkaConsumer.poll(10);
//                for (Iterator it = records.iterator(); it.hasNext();) {
//                    ConsumerRecord record = (ConsumerRecord) it.next();
////                    System.out.println(String.format("Topic - %s, Partition - %d, Value: %s", record.topic(), record.partition(), record.value()));
//                    System.out.println(""+record.topic()+record.value());
//                    
//                    ms.add(record.value());
//                     return new ResponseEntity<>(ms, HttpStatus.OK);
//        
//                }
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            kafkaConsumer.close();
//        }
//        
//        
//        
//        return new ResponseEntity<>(ms, HttpStatus.OK);
//
//    }
//    
//    
//    //delete by id
//     @DeleteMapping("/delete/{id}")
//    public ResponseEntity<String> DeleteById(@PathVariable int id) {
//        System.out.println("--------------get method is started");
//        List<Employee> employeesList = new ArrayList<Employee>();
//        employeesList.add(new Employee(1, "lokesh", "gupta", "howtodoinjava@gmail.com"));
//        employeesList.add(new Employee(2, "abrar", "ahamed", "abc@gmail.com"));
//        employeesList.remove(id);
//        return new ResponseEntity<>("delete successful", HttpStatus.OK);
//    }
//
//}
