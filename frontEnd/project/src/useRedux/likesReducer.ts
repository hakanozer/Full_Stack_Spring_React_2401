import { UnknownAction } from "redux";

export interface ILikesAction extends UnknownAction {
    type: string,
    payload: number[]
}

export const likesReducer = (state: number[] = [], action: ILikesAction) => {
    switch (action.type) {
        case 'ALL_LIKES':
            return action.payload
        default:
           return state
    }
}