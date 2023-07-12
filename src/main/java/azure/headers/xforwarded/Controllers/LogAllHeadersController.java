package azure.headers.xforwarded.Controllers;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogAllHeadersController {
    Logger LOG = LoggerFactory.getLogger(LogAllHeadersController.class);

    @GetMapping("/api/listheaders")
    public ResponseEntity<String> listAllHeaders(
    @RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            LOG.info(String.format("Header '%s' = %s", key, value));
        });

        return new ResponseEntity<String>(String.format(headers, HttpStatus.OK);
    }
}
