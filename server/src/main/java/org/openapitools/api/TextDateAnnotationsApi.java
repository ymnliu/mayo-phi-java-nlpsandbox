/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.TextDateAnnotation;
import org.openapitools.model.TextDateAnnotationRequest;
import org.openapitools.model.TextDateAnnotationResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.example.DateExtractor;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-23T13:52:26.252409-07:00[America/Los_Angeles]")
@Validated
@Api(value = "textDateAnnotations", description = "the textDateAnnotations API")
public interface TextDateAnnotationsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /textDateAnnotations : Annotate dates in a clinical note
     * Return the date annotations found in a clinical note
     *
     * @param textDateAnnotationRequest  (optional)
     * @return Success (status code 200)
     *         or Invalid request (status code 400)
     *         or The request cannot be fulfilled due to an unexpected server error (status code 500)
     */
    @ApiOperation(value = "Annotate dates in a clinical note", nickname = "createTextDateAnnotations", notes = "Return the date annotations found in a clinical note", response = TextDateAnnotationResponse.class, tags={ "TextDateAnnotation", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success", response = TextDateAnnotationResponse.class),
        @ApiResponse(code = 400, message = "Invalid request", response = Error.class),
        @ApiResponse(code = 500, message = "The request cannot be fulfilled due to an unexpected server error", response = Error.class) })
    @PostMapping(
        value = "/textDateAnnotations",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<TextDateAnnotationResponse> createTextDateAnnotations(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) TextDateAnnotationRequest textDateAnnotationRequest) {
        String text = textDateAnnotationRequest.getNote().getText();
        List<TextDateAnnotation> annotations = new DateExtractor().findDatesFromString(text);
        TextDateAnnotationResponse res = new TextDateAnnotationResponse()
            .textDateAnnotations(annotations);

        return new ResponseEntity<TextDateAnnotationResponse>(res, HttpStatus.OK);
    }

}
