import axios from "axios";

export const config = axios.create({
    baseURL: "https://jsonbulut.com/api/",
    timeout: 15000
})