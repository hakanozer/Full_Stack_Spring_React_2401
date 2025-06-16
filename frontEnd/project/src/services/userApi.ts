import { IJWTUser, IUser } from "../models/IUser";
import { config } from "./config";

export const jwtControl = (jwt: string) => {
    const headers = {
        Authorization: `Bearer ${jwt}`
    }
    return config.get<IJWTUser>('profile/me', { headers: headers })
}

// user login
export const authLogin = (email: string, password: string) => {
    const sendObj = {
        email: email,
        password: password
    }
    return config.post<IUser>('auth/login', sendObj)
}

export const authSignUp = (name: string, email: string, password: string) => {
    const sendObj = {
        name: name,
        email: email,
        password: password
    }
    return config.post('auth/signup', sendObj)
}

