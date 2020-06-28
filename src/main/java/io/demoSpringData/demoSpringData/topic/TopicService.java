package io.demoSpringData.demoSpringData.topic;

import io.demoSpringData.demoSpringData.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<io.demoSpringData.demoSpringData.topic.Topic> topics = new ArrayList<>(Arrays.asList(
            new io.demoSpringData.demoSpringData.topic.Topic("spring","hbhk","vjh"),
            new io.demoSpringData.demoSpringData.topic.Topic("java","tfvkhvh","gvkh"),
            new io.demoSpringData.demoSpringData.topic.Topic("hnlkc","vhb","fcgvhbj")
    ));

    public List<io.demoSpringData.demoSpringData.topic.Topic> getAllopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public io.demoSpringData.demoSpringData.topic.Topic getTopic(String id){
        return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
        //return topicRepository.findOne(id);
    }

    public void addTopic(io.demoSpringData.demoSpringData.topic.Topic topic){
        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, io.demoSpringData.demoSpringData.topic.Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(String id){
        topicRepository.deleteById(id);
    }
}

