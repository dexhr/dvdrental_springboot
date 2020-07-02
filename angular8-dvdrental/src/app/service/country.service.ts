import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  private baseUrl = 'http://localhost:8080/api/v1/countries'

  constructor(private http: HttpClient) { }

  getCountriesList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
