package com.justtocode.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Controller("/greetings")
public class GreetingsController {

    @Operation(summary = "Do things", description = "Try to ")
    @ApiResponse(responseCode = "201", description = "Bar object correctly created",content = @Content(mediaType = "application/json",schema = @Schema(type="BarDto")))
    @ApiResponse(responseCode = "400", description = "Invalid id Supplied")
    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}