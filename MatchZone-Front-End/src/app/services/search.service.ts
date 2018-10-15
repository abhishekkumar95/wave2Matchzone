import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";
import { Personal } from "../model/personal";
import { TokenStorage } from '../core/token.storage';
import { Result } from '../model/result';
const httpOptions = {
  headers: new HttpHeaders({ "Content-type": "application/json" })
};

@Injectable({
  providedIn: 'root'
})
export class SearchService {
  query: string;
  constructor(private http: HttpClient) { }
  private searchUrl: string = "http://localhost:8084";
  postQuery(query):Observable<any> {
    this.query = query;
    console.log(query);
    return this.http.get<Result[]>(`${this.searchUrl}/api/v1/search/` + this.query);
  }
 
}
