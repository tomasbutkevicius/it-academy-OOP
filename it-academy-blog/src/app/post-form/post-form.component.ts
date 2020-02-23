import { Component, OnInit } from "@angular/core";
import { PostsService } from "../services/posts.service";
import { Post } from "../shared/post";
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: "app-post-form",
  templateUrl: "./post-form.component.html",
  styleUrls: ["./post-form.component.scss"]
})

export class PostFormComponent implements OnInit {
  constructor(private postsService: PostsService, private fb: FormBuilder) {}
  post: Post;
  serverErrorMessage: string;

postForm = this.fb.group({
  author: ['', [
    Validators.required
  ]],
  content: ['', [
    Validators.required
  ]],
  email: ['', [
    Validators.required,
    Validators.maxLength(30),
    Validators.pattern("[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$")
  ]],
  title: ['', [
    Validators.required,
    Validators.maxLength(30),
    Validators.minLength(3)
  ]],
});

  get author(){
    return this.postForm.get('author');
  }
  get content(){
    return this.postForm.get('content');
  }
  get email(){
    return this.postForm.get('email');
  }
  get title(){
    return this.postForm.get('title');
  }

  ngOnInit(): void {
    this.post = { author: "", content: "", email: "", title: "" };
  }

  onSubmit() {
    this.postsService.addPost(this.post).subscribe(
      () => {
        this.post = { author: "", content: "", email: "", title: "" };
        this.serverErrorMessage = "";
      },
      error => (this.serverErrorMessage = error)
    );
  }
}
