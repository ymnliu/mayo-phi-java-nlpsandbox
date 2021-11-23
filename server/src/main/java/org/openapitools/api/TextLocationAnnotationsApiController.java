package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
@Controller
@RequestMapping("${openapi.nLPSandboxPHIAnnotator.base-path:/api/v1}")
public class TextLocationAnnotationsApiController implements TextLocationAnnotationsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TextLocationAnnotationsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
