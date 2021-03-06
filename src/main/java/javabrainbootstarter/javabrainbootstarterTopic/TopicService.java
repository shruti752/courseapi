package javabrainbootstarter.javabrainbootstarterTopic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

   private List<Topic> topics =  new ArrayList<>(Arrays.asList(
             new Topic("spring","spring framework","spring framework description"),
                new Topic("java","core java","core java description"),
                new Topic("javascript","javascript","javasript description")
        ));
   public List<Topic> getAllTopics(){
       return topics;
   }
   public Topic getTopic(String id){
    return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
   }

   public void addTopic(Topic topic){
       topics.add(topic);
   }
   public void updateTopic(String id, Topic topic){
       for(int i = 0;i<topics.size();i++){
           Topic t = topics.get(i);
               topics.set(i,topic);
               return;
           }
       }

    public void deleteTopic(String id) {
       topics.removeIf(t->t.getId().equals(id));
    }
}

