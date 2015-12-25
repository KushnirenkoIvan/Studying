package org.rest.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.rest.entities.Data;
import org.rest.entities.TestInfo;
import org.rest.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Iterator;

@Service
public class JSONConverter {

    @Autowired
    private ObjectMapper mapper;

    public ObjectNode toJson(User user) {
        return mapper.valueToTree(user);
    }

    public ObjectNode toJson(User user, Data data) {
        ObjectNode nodeUser = mapper.valueToTree(user);
        ObjectNode nodeData = mapper.valueToTree(data);
        nodeUser.setAll(nodeData);
        return (ObjectNode) mapper.createObjectNode().set("user", nodeUser);
    }

    public ObjectNode createCustomJSON(TestInfo testInfo) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.valueToTree(testInfo);

        Iterator<String> iter = jsonNode.fieldNames();
        ObjectNode objectNode = objectMapper.createObjectNode();
        while (iter.hasNext()) {
            String valueName = iter.next();
            if (!valueName.equals("id") && !valueName.equals("errorCode")) {
                objectNode.put(valueName, jsonNode.get(valueName));
            }
        }
        return objectNode;
    }

}
