package solutions.lightprocessing.tsms.api.configuration

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import solutions.lightprocessing.tsms.api.response.ErrorResponse

@ControllerAdvice
class ExceptionConfiguration {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    ErrorResponse defaultErrorHandler(Exception e) {
        [ e.getMessage() ]
    }
}
