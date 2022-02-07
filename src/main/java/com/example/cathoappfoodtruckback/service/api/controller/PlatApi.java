/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.cathoappfoodtruckback.service.api.controller;

import com.example.cathoappfoodtruckback.service.api.model.Error;
import com.example.cathoappfoodtruckback.service.api.model.PlatDTO;
import com.example.cathoappfoodtruckback.service.exception.FunctionalException;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "Plat", description = "the Plat API")
public interface PlatApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /v1/plat/all : get all Plat
     * get all Plat
     *
     * @return Successful response - returns an array of &#x60;PlatDTO&#x60; entities. (status code 200)
     *         or Bad request (status code 400)
     */
    @ApiOperation(value = "get all Plat", nickname = "getPlats", notes = "get all Plat", response = PlatDTO.class, responseContainer = "List", tags={ "Plat", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful response - returns an array of `PlatDTO` entities.", response = PlatDTO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request", response = Error.class) })
    @RequestMapping(value = "/v1/plat/all",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<PlatDTO>> getPlats() throws FunctionalException {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"note\" : 1, \"id_boisson\" : 0, \"prix\" : 6, \"description\" : \"description\", \"nom\" : \"nom\", \"url_image\" : \"url_image\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}