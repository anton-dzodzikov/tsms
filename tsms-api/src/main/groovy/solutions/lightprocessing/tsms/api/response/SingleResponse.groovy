package solutions.lightprocessing.tsms.api.response

class SingleResponse {
    ResponseStatus status = ResponseStatus.OK
    Object body

    SingleResponse(Object body) {
        this.body = body
    }
}