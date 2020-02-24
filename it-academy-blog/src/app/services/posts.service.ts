import { Injectable } from "@angular/core";
import { Post } from "../shared/post";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';

@Injectable({
  providedIn: "root"
})
export class PostsService {
  private readonly apiPath = "/api";
  apiUrl = 'http://localhost:3000';
  
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    })
  };

  constructor(private httpClient: HttpClient) {}
  getPosts(): Observable<Post[]> {
    return this.httpClient.get<Post[]>(`${this.apiPath}/posts`);
  }
  getPost({ id }): Observable<Post> {
    return this.httpClient.get<Post>(`${this.apiPath}/posts/${id}`);
  }

  addPost(post: Post): Observable<Post> {
    return this.httpClient
      .post<Post>(`${this.apiPath}/posts`, post)
      .pipe(catchError(this.errorHandler));
  }

  updatePost(id: number, post: Post): Observable<Post> {
    return this.httpClient.put<Post>(`${this.apiUrl}/Posts/${id}`, post, this.httpOptions).pipe(
      catchError(this.errorHandler)
    );
  }

  errorHandler() {
    return throwError(
      "Sorry, our services does not work right now, please try that later"
    );
  }
}
