package io.demoSpringData.demoSpringData.topic;

import java.util.*;

import io.demoSpringData.demoSpringData.topic.Topic;
import io.demoSpringData.demoSpringData.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<io.demoSpringData.demoSpringData.topic.Topic> getAllTopics(){
        return topicService.getAllopics();
    }

    @RequestMapping("topics/{id}")
    public io.demoSpringData.demoSpringData.topic.Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody io.demoSpringData.demoSpringData.topic.Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
