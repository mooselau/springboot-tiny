package rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import demo.Application;
import demo.model.User;
import demo.rabbitmq.RabbitMqProducer;


@SpringBootTest(classes = Application.class)
public class MessageQueueTest {

    @Autowired
    private RabbitMqProducer producer;

    @Test
    public void testMessage() {
        producer.sendMsg("FAKE NEWS!");

        producer.sendUser(new User());
    }

}
