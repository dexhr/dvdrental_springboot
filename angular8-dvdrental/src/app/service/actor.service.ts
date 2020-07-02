import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ActorService {

  private baseUrl = 'http://localhost:8080/api/v1/actors'

  constructor(private http: HttpClient) { }

  getActorsList(): Observable<any>{
    return this.http.get(`${this.baseUrl}`);
  }
}
