package solutions.lightprocessing.tsms.api.response

class ErrorResponse {
    ResponseStatus status = ResponseStatus.ERROR
    Object body

    ErrorResponse(Object body) {
        this.body = body
    }
}